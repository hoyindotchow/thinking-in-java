package com.eddiechow.exercise.twentyone;

public class CurrencyEnumLoop {
    public static void main(String[] args){

        for(CurrencyEnum.Currency s: CurrencyEnum.Currency.values()){
            System.out.println(s + " " + s.ordinal());
        }
    }
}
