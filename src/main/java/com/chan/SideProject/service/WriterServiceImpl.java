package com.chan.SideProject.service;

import com.chan.SideProject.dto.WriterDTO;
import com.chan.SideProject.entity.Writer;
import com.chan.SideProject.repository.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WriterServiceImpl implements WriterService {

    @Autowired
    private WriterRepository writerRepository;

    @Override
    public Long save(WriterDTO writerDTO) {
        Writer writer = DtoToEntity(writerDTO);
        writerRepository.save(writer);

        return writer.getWno();
    }
}
