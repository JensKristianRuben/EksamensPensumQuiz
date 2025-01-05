package com.example.eksamenspensumquiz.Controller;

import com.example.eksamenspensumquiz.Model.Question;
import com.example.eksamenspensumquiz.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuestionsController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/questions")
    public String questions(@RequestParam(value = "questionIndex", defaultValue = "0") int questionIndex, Model model) {
        Question currentQuestion = questionService.getQuestionByIndex(questionIndex);
        int totalQuestions = questionService.getTotalQuestions();

        if (currentQuestion == null) {
            model.addAttribute("correctAnswers", questionService.checkAllAnswers());
            return "quizCompleted";
        }

        model.addAttribute("question", currentQuestion);
        model.addAttribute("questionIndex", questionIndex);  // Brug questionIndex
        model.addAttribute("totalQuestions", totalQuestions);

        return "questions";
    }

    @PostMapping("/submitAnswer")
    public String submitAnswer(@RequestParam String answer, @RequestParam int questionIndex) {
        questionService.saveAnswer(questionIndex, answer);

        // Omdiriger til næste spørgsmål ved at øge questionIndex
        return "redirect:/questions?questionIndex=" + (questionIndex + 1);
    }

}
