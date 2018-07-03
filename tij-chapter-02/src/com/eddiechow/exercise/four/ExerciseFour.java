package com.eddiechow.exercise.four;

import java.util.Random;

public class ExerciseFour {
	public static void main (String args[]){
		
		double v;
		int d;
		int t;
		
		Random rando = new Random(88);
		VelocityCalculate VCal = new VelocityCalculate();
		
		d = rando.nextInt();
		t = rando.nextInt();
		
		System.out.println("Distance " + d + " Time" + t );
		
		v =  VCal.calculateVelocity(d, t);
		
		System.out.println(v);
		
	}
}
