package com.jimbob.app;

public class Player {

	String name;
	int numHits;
	int numErrors;
	
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
			throw new IllegalArgumentException("Number must be positive");
		}
	}
	public void setNumErros(int numErrors) {
		this.numErrors = numErrors;
		if(numErrors < 0){
			throw new IllegalArgumentException("Number must be positive");
		}
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", numHits=" + numHits + ", numErrors=" + numErrors + "]";
	}
	
}
