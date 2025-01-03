package com.Project.QuizApp.constant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data		//comes from lombok no need to create getters and setters and toString
@Entity		//to mark the class as JPA entity
public class Question {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String category;
	private String difficultylevel;
	private String questionTitle;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String rightAnswer;
	
}
