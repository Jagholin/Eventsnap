package com.example.server;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tags {
	
	@Id
	private Long id;
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	

}
