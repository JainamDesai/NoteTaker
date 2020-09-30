package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	
	public String answer;
	@ManyToMany
	public List<Question> q;
	
	public List<Question> getQ() {
		return q;
	}
	public void setQ(List<Question> q) {
		this.q = q;
	}
	@Id
	public int answer_id;
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

}
