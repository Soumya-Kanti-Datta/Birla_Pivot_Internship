package com.project.quizapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizappApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizappApplication.class, args);
	}

}


//now we have to fetch the questions from the DB so this is the workflow
// User -> Control Layer -> Service Layer(Here we do some processing/Business Layer)  -> DAO Layer -> DB