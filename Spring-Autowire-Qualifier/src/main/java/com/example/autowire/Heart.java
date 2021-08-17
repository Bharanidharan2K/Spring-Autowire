package com.example.autowire;

public class Heart {

	private String typeOfHeart;
	private int noOfheart;

	public String getTypeOfHeart() {
		return typeOfHeart;
	}

	public void setTypeOfHeart(String typeOfHeart) {
		this.typeOfHeart = typeOfHeart;
	}

	public int getNoOfheart() {
		return noOfheart;
	}

	public void setNoOfheart(int noOfheart) {
		this.noOfheart = noOfheart;
	}

	public void pump() {
		System.out.println("Your heart is pumping Ur Alive");
	}
}
