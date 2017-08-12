package com.eddiechow.exercise.ten;

public class ExerciseTen {
		public static void main(String args[]){
			
			int i = 10;
			Integer.toBinaryString(i);
			
			int j = 5;
			Integer.toBinaryString(j);
			
			System.out.println(i ^ j);
			System.out.println(i & j);
			System.out.println(i | j);
			System.out.println(~i);
			System.out.println(~j);

		}

}
