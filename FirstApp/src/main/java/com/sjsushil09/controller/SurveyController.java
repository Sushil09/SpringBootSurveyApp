package com.sjsushil09.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sjsushil09.model.Question;
import com.sjsushil09.service.SurveyService;

@RestController
public class SurveyController {
	@Autowired
	private SurveyService surveyService; 

	@GetMapping("/surveys/{surveyId}/questions")
	public List<Question> retrieveQuestions(@PathVariable int surveyId){
		return surveyService.retrieveQuestion(surveyId);
	}
	
	@GetMapping("/surveys/{surveyId}/questions/{questionId}")
	public Question retrieveQuestions(@PathVariable int surveyId,@PathVariable int questionId){
		return surveyService.retrieveQuestion(surveyId,questionId);
	}
}
