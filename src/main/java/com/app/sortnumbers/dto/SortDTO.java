package com.app.sortnumbers.dto;

public class SortDTO extends ResponseDTO {
	
	private double id;
	
	private String outputArray;
	
	private String inputArray;
	
	private long timeTaken;
	
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

	public long getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(long timeTaken) {
		this.timeTaken = timeTaken;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}
	
}
