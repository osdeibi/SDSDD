package com.tmm.android.chuck.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
	
	private String question;
	private ArrayList<String> answers = new ArrayList<String>();
	private ArrayList<Double> values = new ArrayList<Double>();

		
	
	
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @return the answer
	 */
	public String getAnswer(int index) {
		return answers.get(index);
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer( int index, String answer) {
		this.answers.add(index, answer);
	}
	public void setAnswer( int index, String answer, double value) {
		this.answers.add(index, answer);
		this.values.add(index, value);
	}
	
	/**
	 * @return the answer value
	 */
	public Double getAnswerValue(int index) {
		return values.get(index);
	}
	public Double getAnswerValue(String answer) {
		int index;
		index=this.answers.indexOf(answer);
		return this.getAnswerValue(index);
	}
	/**
	 * @param answer the answer value to set
	 */
	public void setAnswerValue( int index, Double value) {
		this.values.add(index, value);
	}
	
		
	
	public List<String> getQuestionOptions(){
		@SuppressWarnings("unchecked")
		List<String> shuffle = (List<String>) this.answers.clone();
		Collections.shuffle(shuffle);
		return shuffle;
	}

}
