package com.Project.QuizApp.constant;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

//One quiz can have many questions but then few questions can be repeated in many quizes, 
//so we have to ManyToMany relation in the table rather than OneToMany, 
//for that we have to create new table.
//We need Primary key, title and questions, we cannot have it in one table as one quiz can have multiple question
//So we need multiple tables also called as mapping tables.

@Data
@Entity
public class Quiz {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String title;
	@ManyToMany //Research 
	private List<Question> questions;
}
