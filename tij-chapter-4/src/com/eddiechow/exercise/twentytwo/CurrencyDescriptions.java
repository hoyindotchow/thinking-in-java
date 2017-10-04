package com.eddiechow.exercise.twentytwo;

public class CurrencyDescriptions {

    CurrencyEnum.Currency money;

    public CurrencyDescriptions(CurrencyEnum.Currency money) {
        this.money = money;
    }

    public void describe() {
        switch (money) {
            case RMB:
                System.out.println("CHINA");
                break;
            case YEN:
                System.out.println("JAPAN");
                break;
            case EURO:
                System.out.println("EUROPE");
                break;
            case PESO:
                System.out.println("MEXICO");
                break;
            case POUND:
                System.out.println("UK");
                break;
            case DOLLAR:
                System.out.println("USA");
                break;
        }
    }
}
