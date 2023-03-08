package com.chan.SideProject.controller;

import com.chan.SideProject.dto.BoardDTO;
import com.chan.SideProject.dto.WriterDTO;
import com.chan.SideProject.service.BoardService;
import com.chan.SideProject.service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;
    @Autowired
    private WriterService writerService;

    @GetMapping({"", "list"})
    public String list(Model model) {
        model.addAttribute("boards", boardService.getAllBoard());

        return "list";
    }

    @PostMapping("/save")
    public String save(BoardDTO boardDTO, WriterDTO writerDTO) {
        Long wno = writerService.save(writerDTO);
        boardService.save(wno, boardDTO);

        return "redirect:/list";
    }

    @GetMapping("/modify/{bno}")
    public String modify(@PathVariable Long bno, Model model) {

        model.addAttribute("board", boardService.getOneBoard(bno));

        return "modify";
    }

    @PostMapping("/modify")
    public String modify(Long wno, BoardDTO boardDTO) {
        boardService.save(wno, boardDTO);

        return "redirect:/list";
    }

    @GetMapping("/delete/{bno}")
    public String delete(@PathVariable Long bno){
        boardService.delete(bno);
        return "redirect:/list";
    }
}
