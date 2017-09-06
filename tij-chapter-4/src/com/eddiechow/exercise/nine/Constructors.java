package com.eddiechow.exercise.nine;

public class Constructors {

    Constructors(){
        this("Hoes");
        System.out.println("Called Overloaded Constructors(String)");
    }

    Constructors(String printString){
        System.out.println("Called from Default Constructor passing the String " + printString);
    }
}
