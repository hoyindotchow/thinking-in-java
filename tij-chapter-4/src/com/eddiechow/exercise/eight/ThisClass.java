package com.eddiechow.exercise.eight;

public class ThisClass {

    public void methodCaller(){
        methodCalled("Without This");
        this.methodCalled("With This");

    }

    public void methodCalled(String s){
        System.out.println(s);

    }
}
