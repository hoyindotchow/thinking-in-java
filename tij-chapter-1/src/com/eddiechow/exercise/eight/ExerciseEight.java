package com.eddiechow.exercise.eight;

import com.eddiechow.exercise.eight.StaticClass;

public class ExerciseEight {
	public static void main(String[] args){
		
		StaticClass object1 = new StaticClass();
		object1.display();
		
		object1.s = "New String";
		
		StaticClass object2 = new StaticClass();
		object2.display();
		
		object2.s = "Another String";
		
		StaticClass object3 = new StaticClass();
		object3.display();
		
		object1.display();
		object2.display();
		object3.display();
		
	}
	
}
