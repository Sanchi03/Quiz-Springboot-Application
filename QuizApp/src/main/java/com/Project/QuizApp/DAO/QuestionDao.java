package com.Project.QuizApp.DAO;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Project.QuizApp.constant.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{

	/*
	 * public void getAllQuestions() { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	
	List<Question> findByCategory(String category);
	
	@Query("SELECT q FROM Question q WHERE q.category = :category ORDER BY FUNCTION('RANDOM')") 
	List<Question> findRandomQuestionsByCategory(@Param("category") String category, Pageable pageable);

	/*
	 * @Query(
	 * value="SELECT * FROM question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQ"
	 * ,nativeQuery = true) List<Question>
	 * findRandomQuestionsByCategory(@Param("category") String
	 * category, @Param("numQ") Pageable pageable);
	 */
	
	/*
	 * @Query(value =
	 * "SELECT * FROM question q WHERE q.category = :category ORDER BY RANDOM() LIMIT :numQ"
	 * , nativeQuery = true) List<Question>
	 * findRandomQuestionsByCategoryNative(@Param("category") String
	 * category, @Param("numQ") int numQ);
	 */

	

}
