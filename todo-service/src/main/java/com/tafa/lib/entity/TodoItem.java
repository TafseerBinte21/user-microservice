package com.tafa.lib.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TodoItem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String userId; // Will link to profile-service user
    private String title;
    private String description;
    private boolean completed;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
    
    

}
