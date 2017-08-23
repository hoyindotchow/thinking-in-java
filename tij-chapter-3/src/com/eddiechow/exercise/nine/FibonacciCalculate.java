package com.eddiechow.exercise.nine;

/**
 * Created by liferay on 8/11/2017.
 */
public class FibonacciCalculate {
    public void displayFibNumbers(int count) {

        int Fc = 0;
        int Fc1 = 0;
        int Fc2 = 1;

        System.out.println("The " + count + " numbers of the Fibonacci sequence are: ");

        for (int i = 1; i <= count; i++) {
            Fc = Fc1 + Fc2;
            System.out.print(Fc + " ");
            Fc2 = Fc1;
            Fc1 = Fc;
        }

    }
}
