package com.eddiechow.exercise.twentytwo;



public class CurrencyDescriptionOutput {
    public static void main(String[] args){

        CurrencyDescriptions
                money1 = new CurrencyDescriptions(CurrencyEnum.Currency.DOLLAR),
                money2 = new CurrencyDescriptions(CurrencyEnum.Currency.EURO),
                money3 = new CurrencyDescriptions(CurrencyEnum.Currency.PESO),
                money4 = new CurrencyDescriptions(CurrencyEnum.Currency.POUND),
                money5 = new CurrencyDescriptions(CurrencyEnum.Currency.RMB),
                money6 = new CurrencyDescriptions(CurrencyEnum.Currency.YEN);

        money1.describe();
        money2.describe();
        money3.describe();
        money4.describe();
        money5.describe();
        money6.describe();
    }
}

