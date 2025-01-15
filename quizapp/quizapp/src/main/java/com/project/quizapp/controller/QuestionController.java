package com.project.quizapp.controller;

import com.project.quizapp.model.Quiz_Questions;
import com.project.quizapp.service.QuestionService;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    public List<Quiz_Questions> AllQuestion(){
        return questionService.getAllQuestion();
    }

    @GetMapping("/category/{subject}")
    public List<Quiz_Questions> getQuestionsByCategory(@PathVariable("subject") String category){
        return questionService.getQuestionbyCategory(category);
    }

    @PostMapping("/addQuestion")
    public void addQuestion(@RequestBody Quiz_Questions question){
        questionService.addQuestion(question);
    }


}
