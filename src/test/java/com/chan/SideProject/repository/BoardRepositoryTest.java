package com.chan.SideProject.repository;

import com.chan.SideProject.entity.Board;
import com.chan.SideProject.entity.Writer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    @DisplayName("테스트 방명록 삽입")
    public void insertBoards(){
        IntStream.rangeClosed(1,50).forEach(i->{
            long wno = (long)(Math.random() * 10) + 1; // 1~10 중 랜덤 수
            Writer writer = Writer.builder()
                    .wno(wno)
                    .build();

            Board board = Board.builder()
                    .writer(writer)
                    .content("테스트 내용" + i)
                    .build();

            boardRepository.save(board);
        });
    }
}