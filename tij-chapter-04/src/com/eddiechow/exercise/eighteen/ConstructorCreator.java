package com.eddiechow.exercise.eighteen;


public class ConstructorCreator {
    public static void main(String[] args){

        ArrayConstructor[] _arrayConstructor = new ArrayConstructor[3];
        _arrayConstructor[0] = new ArrayConstructor("HERE IS A STRING");
        _arrayConstructor[1] = new ArrayConstructor("HERE IS A STRING");
        _arrayConstructor[2] = new ArrayConstructor("HERE IS A STRING");

        for(ArrayConstructor s : _arrayConstructor){
            System.out.println(s);
        }
    }
}
