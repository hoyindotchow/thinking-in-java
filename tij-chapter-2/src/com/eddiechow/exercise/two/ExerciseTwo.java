package com.eddiechow.exercise.two;

public class ExerciseTwo {
	public static void main (String args[]){
		
		FloatObject f = new FloatObject();
		FloatObject y = new FloatObject();
		
		f.number = 1.11f;
		y.number = 2.22f;
		System.out.println("This is f: " + f.number + " This is y: " + y.number);
		
		f=y;
		
		f.number = 3.33f;
		System.out.println("This is f: " + f.number + " This is y: " + y.number);
		
		y.number = 4.44f;
		System.out.println("This is f: " + f.number + " This is y: " + y.number);

		
	}

}
