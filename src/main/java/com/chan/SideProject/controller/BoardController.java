package com.chan.SideProject.controller;

import com.chan.SideProject.repository.BoardRepository;
import com.chan.SideProject.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping({"", "list"})
    public void list(Model model) {
        model.addAttribute("boards", boardService.getAllBoard());
    }


}
