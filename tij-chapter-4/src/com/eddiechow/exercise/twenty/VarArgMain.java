package com.eddiechow.exercise.twenty;

public class VarArgMain {
    public static void main(String... args){
        for(String str: args){
            System.out.println(str);
        }
    }
}
