package com.chan.SideProject.service;

import com.chan.SideProject.dto.BoardDTO;
import com.chan.SideProject.entity.Board;
import com.chan.SideProject.entity.Writer;

import java.util.List;

public interface BoardService {

    List<BoardDTO> getAllBoard(); // 방명록 가져오기

    default BoardDTO entityToDTO(Board board){

        BoardDTO boardDTO = BoardDTO.builder()
                .bno(board.getBno())
                .content(board.getContent())
                .nickname(board.getWriter().getNickname())
                .build();

        return boardDTO;
    }

}
