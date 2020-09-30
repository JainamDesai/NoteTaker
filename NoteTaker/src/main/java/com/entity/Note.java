package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "MyNotes")
public class Note {
	public Note() {
		super();
	}
	public Note(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	private String title;
	private String content;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
