package com.eddiechow.exercise.ninteen;

public class PrintVarArg {
    public static void main(String[] args){

        String[] arrayOfStrings= {"Poop", "Birbs"};


        VarArgArray strArray = new VarArgArray();

        strArray.varArg(arrayOfStrings);
        strArray.varArg("Here","are", "Strings");

    }
}
