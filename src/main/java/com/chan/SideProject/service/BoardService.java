package com.chan.SideProject.service;

import com.chan.SideProject.dto.BoardDTO;
import com.chan.SideProject.entity.Board;
import com.chan.SideProject.entity.Writer;

import java.util.List;

public interface BoardService {


    List<BoardDTO> getAllBoard(); // 방명록 가져오기
    BoardDTO getOneBoard(Long bno); // 해당 bno의 방명록 가져오기

    Long save(Long wno, BoardDTO boardDTO);

    void delete(Long bno);

    default BoardDTO entityToDTO(Board board){

        BoardDTO boardDTO = BoardDTO.builder()
                .bno(board.getBno())
                .content(board.getContent())
                .nickname(board.getWriter().getNickname())
                .wno(board.getWriter().getWno())
                .build();

        return boardDTO;
    }

    default Board DtoToEntity(Long wno, BoardDTO boardDTO) {

        Board board = Board.builder()
                .bno(boardDTO.getBno())
                .writer(Writer.builder().wno(wno).build())
                .content(boardDTO.getContent())
                .build();

        return board;
    }

}
