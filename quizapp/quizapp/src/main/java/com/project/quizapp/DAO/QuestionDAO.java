package com.project.quizapp.DAO;

import com.project.quizapp.model.Quiz_Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDAO extends JpaRepository<Quiz_Questions, Integer> {
    List<Quiz_Questions> findByCategory(String subject);
}
