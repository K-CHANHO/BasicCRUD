package com.chan.SideProject.service;

import com.chan.SideProject.dto.WriterDTO;
import com.chan.SideProject.entity.Writer;

public interface WriterService {

    Long save(WriterDTO writerDTO);

    default WriterDTO EntityToDto(Writer writer) {

        WriterDTO writerDTO = WriterDTO.builder()
                .nickname(writer.getNickname())
                .password(writer.getPassword())
                .build();

        return writerDTO;
    }

    default Writer DtoToEntity(WriterDTO writerDTO) {
        Writer writer = Writer.builder()
                .nickname(writerDTO.getNickname())
                .password(writerDTO.getPassword())
                .build();

        return writer;
    }
}
