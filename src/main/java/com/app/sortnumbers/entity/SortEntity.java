package com.app.sortnumbers.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SortEntity {
	
	@Id
	private Double id;
	
	private String outputArray;
	
	private String inputArray;
	
	private Long timeTaken;
	
	public SortEntity() {
		
	}
	
	public SortEntity(Double id, String outputArray, String inputArray, Long timeTaken) {
		super();
		this.id = id;
		this.outputArray = outputArray;
		this.inputArray = inputArray;
		this.timeTaken = timeTaken;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getOutputArray() {
		return outputArray;
	}

	public void setOutputArray(String outputArray) {
		this.outputArray = outputArray;
	}

	public String getInputArray() {
		return inputArray;
	}

	public void setInputArray(String inputArray) {
		this.inputArray = inputArray;
	}

	public Long getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(Long timeTaken) {
		this.timeTaken = timeTaken;
	}
	
}
