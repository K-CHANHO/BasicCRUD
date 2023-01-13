package com.chan.SideProject.service;

import com.chan.SideProject.dto.BoardDTO;
import com.chan.SideProject.entity.Board;
import com.chan.SideProject.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardRepository boardRepository;

    @Override
    public List<BoardDTO> getAllBoard() {

        List<BoardDTO> boardDTOs = new ArrayList<>();
        List<Board> boards = boardRepository.findAll();

        boards.forEach(board -> {
            boardDTOs.add(entityToDTO(board));
        });

        return boardDTOs;
    }
}
