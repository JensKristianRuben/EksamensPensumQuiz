package com.example.eksamenspensumquiz.Model;

import java.util.List;

public class Question {
    private String questionText;
    private String correctAnswer;
    private List<String> options;

    public Question(String questionText, String correctAnswer, List<String> options) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.options = options;
    }
    public String getQuestionText(){
        return questionText;
    }
    public void SetQuestionText(String questionText){
        this.questionText = questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

}
