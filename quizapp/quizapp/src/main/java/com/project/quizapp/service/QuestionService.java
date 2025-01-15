package com.project.quizapp.service;

import com.project.quizapp.DAO.QuestionDAO;
import com.project.quizapp.model.Quiz_Questions;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
//LOL
import java.util.ArrayList;
import java.util.List;

@Component
public class QuestionService {
    @Autowired
    QuestionDAO questionDao;

    public ResponseEntity<List<Quiz_Questions>> getAllQuestion(){
        try{
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Quiz_Questions>> getQuestionbyCategory(String category){
        try{
            return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST)

    }


    public void addQuestion(Quiz_Questions question){
        questionDao.save(question);
    }
}
