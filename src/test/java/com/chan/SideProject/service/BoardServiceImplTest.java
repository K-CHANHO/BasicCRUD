package com.chan.SideProject.service;

import com.chan.SideProject.dto.BoardDTO;
import com.chan.SideProject.entity.Board;
import com.chan.SideProject.repository.BoardRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardServiceImplTest {

    @Autowired
    private BoardService boardService;

    @Test
    @DisplayName("방명록 목록 확인")
    void getAllBoard() {

        List<BoardDTO> allBoard = boardService.getAllBoard();

        allBoard.forEach(boardDTO -> {
            System.out.println("boardDTO = " + boardDTO);
        });

    }
}