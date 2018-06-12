package com.codingdojo.models;

public class Dog extends Animal implements Pet {
	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	@Override
	public String showAffection(){
		String statement;
		String tempName = this.getName();
		String tempBreed = this.getBreed();
		int tempWeight = this.getWeight();
		
		if(tempWeight >= 30) {
			statement = tempName + " wants to hug you! Sike! And it's a " + tempBreed;
		} else {
			statement = tempName + " will like to play a game! But it's only a " + tempBreed;
		}
		
		return statement;
	}
}
