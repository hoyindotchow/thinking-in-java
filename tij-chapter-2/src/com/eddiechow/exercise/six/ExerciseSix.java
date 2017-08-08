package com.eddiechow.exercise.six;

public class ExerciseSix {
	public static void main(String args[]){
		
		Dog spot = new Dog();
		Dog scruffy = new Dog();
		Dog testDog = new Dog();
		
		boolean dogTester;
		
		spot.name = "spot";
		spot.says = "Ruff!";
		
		testDog = spot;
		
		dogTester = testDog==spot;
		System.out.println(dogTester);
		
		dogTester = testDog.equals(spot);
		System.out.println(dogTester);
		
		scruffy.name = "scruffy";
		scruffy.says = "Wurf!";
		
		System.out.println(spot.name + " " + spot.says);
		System.out.println(scruffy.name + " " + scruffy.says);
		
		

		
	}
}
