package com.jimbob.app;

public class Player {

	private String name;
	private int numHits;
	private int numErrors;
	
	Player(String name, int numHits, int numErrors){
		this.setName(name);
		this.setNumHits(numErrors);
		this.setNumErros(numHits);
	}
	
	public String getName() {
		return name;
	}
	public int getNumHits() {
		return numHits;
	}
	public int getNumErros() {
		return numErrors;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumHits(int numHits) {
		this.numHits = numHits;
		if(numHits < 0){
			throw new IllegalArgumentException("Must be a number > 0");
		}
	}
	public void setNumErros(int numErrors) {
		this.numErrors = numErrors;
		if(numErrors < 0){
			throw new IllegalArgumentException("Must be a number > 0");
		}
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", numHits=" + numHits + ", numErrors=" + numErrors + "]";
	}
	
}
