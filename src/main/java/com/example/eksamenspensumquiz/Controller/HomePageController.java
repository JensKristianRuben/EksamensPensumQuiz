package com.example.eksamenspensumquiz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomePageController {

    @GetMapping("/")
    public String homePage() {

        return "homePage";
    }

    @PostMapping("/StartQuiz")
    public String startQuiz() {

        return "redirect:/questions";
    }

}
