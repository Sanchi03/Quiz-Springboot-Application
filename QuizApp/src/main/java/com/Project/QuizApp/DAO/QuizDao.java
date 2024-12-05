package com.Project.QuizApp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.QuizApp.constant.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer>{


	
}
