package com.eddiechow.exercise.six;

public class Dog {
	
	public void bark(String str, int i){
		System.out.println("BORK BORK " + str + i);
	}
	
	public void bark(int i, String str){
		System.out.println("BARK BARK " + i + str);
	}
	
	public void bark(int i){
		System.out.println("BARK BARK " + i);
	}
	
	public void bark(char c){
		System.out.println("WOOF WOOF " + c);
	}
	
	

}
