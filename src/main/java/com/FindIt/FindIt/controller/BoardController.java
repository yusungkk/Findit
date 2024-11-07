package com.FindIt.FindIt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    public String boardListPage(Model model){
        model.addAttribute("items",boardService.findAll());
        return "boardList";
    }

    @GetMapping
    public String postListPage(Model model) {
    }

    // 게시판 생성 페이지
    @GetMapping("/create")
    public String boardCreatePage() {
        return "board/create";
    }

    // 게시판 수정 페이지
    @GetMapping("/update")
    public String boardUpdatePage() {
        return "board/update";
    }


}
