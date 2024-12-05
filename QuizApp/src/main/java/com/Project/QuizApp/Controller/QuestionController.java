package com.Project.QuizApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.QuizApp.Service.QuestionService;
import com.Project.QuizApp.constant.Question;

@RestController
@RequestMapping("question")
public class QuestionController {

	@Autowired
	QuestionService questionService;
	
	//url=localhost:8080/question/allQuestions
	@GetMapping("allQuestions")
	public List<Question> getAllQuestion() {
		return questionService.getAllQuestions();
		}
	
	//url=localhost:8080/question/category/Java or Python 
	@GetMapping("category/{category}")//Pathvariable tells spring to map the value of variable from the url i.e. category to category variable in the parameter
	public List<Question> getQuestionsByCategory(@PathVariable String category){
		return questionService.getQuestionsByCategory(category);
	}
	
	//url=localhost:8080/question/add
	@PostMapping("add")//Requestbody is when you are sending data from client to sever for eg. to add a new question we are sending data to server
	public String addQuestion(@RequestBody Question question) {
		return questionService.addQuestion(question);
	}
	
	//url=localhost:8080/question/deleteById/4
	@DeleteMapping("deleteById/{id}")
	public String deleteById(@PathVariable Integer id) {
		return questionService.deleteById(id);
	}
	
}
