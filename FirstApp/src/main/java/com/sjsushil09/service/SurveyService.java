package com.sjsushil09.service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.sjsushil09.model.Question;
import com.sjsushil09.model.Survey;

@Component
public class SurveyService {
private static List<Survey> surveys=new ArrayList<Survey>();
static {
Question q1=new Question(1,"Largest Country in the World", "Russia",Arrays.asList(
		"India", "Russia", "United States", "China"));
Question q2=new Question(2,"Most Populus Country in the World", "China",Arrays.asList(
		"India", "Russia", "United States", "China"));
Question q3=new Question(3,"Highest GDP in the World", "United States", Arrays.asList(
		"India", "Russia", "United States", "China"));
Question q4=new Question(4,"Second largest english speaking country", "India", Arrays
		.asList("India", "Russia", "United States", "China"));
List<Question> questions=new ArrayList<>(Arrays.asList(q1,q2,q3,q4));

	Survey survey = new Survey(1, "My Favorite Survey",
			"Description of the Survey", questions);

	surveys.add(survey);
}
public Survey retrieveSurvey(int id) {
	for(Survey sur:surveys) {
		if(sur.getId()==id)
			return sur;
	}
	return null;
}
public List<Question> retrieveQuestion(int SurveyId){
	for(Survey sur:surveys) {
		if(sur.getId()==SurveyId)
			return sur.getQuestions();
	}
	return new ArrayList<>();
}
public Question retrieveQuestion(int SurveyId,int QuestionId) {
	Survey survey=retrieveSurvey(SurveyId);
	for(Question question:survey.getQuestions()) {
		if(question.getId()==QuestionId)
			return question;
	}
	return null;
}

public Question addQuestion(int surveyId, Question question) {
	Survey survey = retrieveSurvey(surveyId);

	if (survey == null) {
		return null;
	}

	Random rand=new Random();
	
	question.setId(rand.nextInt(130));

	survey.getQuestions().add(question);

	return question;
}
}
