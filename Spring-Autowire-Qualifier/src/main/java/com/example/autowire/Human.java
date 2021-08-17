package com.example.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("humanHeartObj")
	private Heart heart;

//	public Human(Heart heart) {
//		this.heart = heart;
//	}
//
//	public void setHeart(Heart heart) {
//		this.heart = heart;
//	}

	public void startPumping() {
		System.out.println("Heart type is "+heart.getTypeOfHeart()+ " no of heart is "+heart.getNoOfheart());
		heart.pump();
	}
}
