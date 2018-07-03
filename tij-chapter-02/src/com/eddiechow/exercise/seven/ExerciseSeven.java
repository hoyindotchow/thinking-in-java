package com.eddiechow.exercise.seven;

import java.util.Random;

public class ExerciseSeven {
	public static void main(String args[]){
		
		int number;
		CoinFlipper coinFlip = new CoinFlipper();
		
		Random rand = new Random(88);
		number = rand.nextInt(1000);
		
		System.out.println(number);
		
		coinFlip.coinFlip(number);
		
		
	}

}
