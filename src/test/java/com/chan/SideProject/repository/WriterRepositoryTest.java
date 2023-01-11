package com.chan.SideProject.repository;

import com.chan.SideProject.entity.Writer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WriterRepositoryTest {

    @Autowired
    private WriterRepository writerRepository;

    @Test
    @DisplayName("작성자 삽입")
    public void insertWriters(){
        IntStream.rangeClosed(1, 10).forEach(i->{
            Writer writer = Writer.builder()
                    .nickname("nickname" + i)
                    .password(1111L)
                    .build();

            writerRepository.save(writer);
        });
    }
}