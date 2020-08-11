package com.sjsushil09.model;

import java.util.List;


public class Question {
	private int id;
	private String description;
	private String correctAns;
	private List<String> options;
	
	//default constructor
	public Question() {
		
	}
	//parameterized constructor
	public Question(int id, String description, String correctAns, List<String> options) {
		super();
		this.id = id;
		this.description = description;
		this.correctAns = correctAns;
		this.options = options;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCorrectAns() {
		return correctAns;
	}
	
	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}
	
	public List<String> getOptions() {
		return options;
	}
	
	public void setOptions(List<String> options) {
		this.options = options;
	}
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", description=" + description + ", correctAns=" + correctAns + ", options="
				+ options + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
