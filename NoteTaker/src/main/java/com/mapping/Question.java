package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {
	
	public String question;
	@ManyToMany(mappedBy="q",fetch=FetchType.EAGER)
	public List<Answer> ans;
	
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	@Id
	public int question_id;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	

}
