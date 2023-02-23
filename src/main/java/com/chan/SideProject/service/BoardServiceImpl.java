package com.chan.SideProject.service;

import com.chan.SideProject.dto.BoardDTO;
import com.chan.SideProject.entity.Board;
import com.chan.SideProject.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<BoardDTO> getAllBoard() {

        List<BoardDTO> boardDTOs = new ArrayList<>();
        List<Board> boards = boardRepository.findAll(Sort.by(Sort.Direction.DESC, "bno"));

        boards.forEach(board -> {
            boardDTOs.add(entityToDTO(board));
        });

        return boardDTOs;
    }

    @Override
    public Long save(Long wno, BoardDTO boardDTO) {
        Board board = DtoToEntity(wno, boardDTO);
        boardRepository.save(board);

        return board.getBno();
    }

    @Override
    public BoardDTO getOneBoard(Long bno) {
        Board board = boardRepository.findById(bno).get();
        BoardDTO boardDTO = entityToDTO(board);

        return boardDTO;
    }


}
