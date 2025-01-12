package com.Project.QuizApp.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Project.QuizApp.DAO.QuestionDao;
import com.Project.QuizApp.DAO.QuizDao;
import com.Project.QuizApp.constant.Question;
import com.Project.QuizApp.constant.QuestionWrapper;
import com.Project.QuizApp.constant.Quiz;
import com.Project.QuizApp.constant.Response;

@Service
public class QuizService {

	@Autowired
	QuizDao quizDao;

	@Autowired
	QuestionDao questionDao;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
		//to set the questions we need to first fetch the list of questions from the DAO
		Pageable pageable = PageRequest.of(0, numQ); // numQ is the limit
		List<Question> questions = questionDao.findRandomQuestionsByCategory(category, pageable);
		//List<Question> questions=questionDao.findRandomQuestionsByCategory(category,numQ);
		Quiz quiz=new Quiz();
		quiz.setTitle(title);
		quiz.setQuestions(questions);
		quizDao.save(quiz);
		return new ResponseEntity<>("Success", HttpStatus.CREATED);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
		/*
		 * Optional keyword is used if the data is optional,it will return the quiz on
		 * the basis of id but what what if you are mentioning a data which is not there,
		 * it will throw a null pointer error, for this optional case we have to use optional.
		 * indicating this is optional data, the data might come or not.
		 */
		Optional<Quiz> quiz=quizDao.findById(id);
		List<Question> questionsFromDB=quiz.get().getQuestions();
		//Convert list of Questions into QuestionWrapper to return 
		List<QuestionWrapper> questionsForUser= new ArrayList<>();
		for(Question q:questionsFromDB) {
			QuestionWrapper qw=new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
			questionsForUser.add(qw);
		}
			
		return new ResponseEntity<>(questionsForUser,HttpStatus.OK);		
	}

	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
		Quiz quiz=quizDao.findById(id).get();
		List<Question> questions=quiz.getQuestions();
		int right=0;
		int i=0;
		for(Response response:responses) {
			if(response.getResponse().equals(questions.get(i).getRightAnswer())) {
				right++;
			}
			i++;
		}
		return new ResponseEntity<>(right,HttpStatus.OK);
	}

	/*
	 * public ResponseEntity<String> createQuiz(String category, int numQ, String
	 * title) {
	 * 
	 * 
	 * List<Question> questions=questionDao.findQuestionByCategory(category, numQ);
	 * Quiz quiz=new Quiz(); quiz.setTitle(title); quiz.setQuestions(questions);
	 * quizDao.save(quiz); return new
	 * ResponseEntity<>("Success",HttpStatus.CREATED);
	 * 
	 * }
	 */

}
