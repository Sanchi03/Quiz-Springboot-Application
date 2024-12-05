package com.Project.QuizApp.Controller;

import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Project.QuizApp.Service.QuizService;
import com.Project.QuizApp.constant.QuestionWrapper;
import com.Project.QuizApp.constant.Response;

@RestController
@RequestMapping("quiz")
public class QuizController {
	
	@Autowired
	QuizService quizService;

	
	 //url=localhost:8080/quiz/create?category=Java&numQ=5&title=JQuiz
	 
	 @PostMapping("create") //RequestParam to accept url variables
	 public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){ 
		 return quizService.createQuiz(category,numQ,title);
	 }
	 
	 @GetMapping("getQuiz/{id}")
	 public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id){
		return quizService.getQuizQuestions(id);
	 }
	 
	 @PostMapping("sumbitQuiz/{id}")
	 //we have to retuen the score of the quiz in integer
	 //We are accepting json format in the server side so we are usung RequestBody
	 public ResponseEntity<Integer> sumitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses){
		 return quizService.calculateResult(id,responses);
	 }

}
