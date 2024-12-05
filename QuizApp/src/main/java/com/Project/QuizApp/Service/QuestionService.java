package com.Project.QuizApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.QuizApp.DAO.QuestionDao;
import com.Project.QuizApp.constant.Question;

@Service
public class QuestionService {
	@Autowired
	QuestionDao questionDao;

	public List<Question> getAllQuestions() {
		
		return questionDao.findAll();
	}

	public List<Question> getQuestionsByCategory(String category) {
		return questionDao.findByCategory(category);
	}

	public String addQuestion(Question question) {
		questionDao.save(question);
		return "Success";
		
	}

	public String deleteById(Integer id) {
		questionDao.deleteById(id);
		return "Success";
	}

	
	
}
