package com.eddiechow.exercise.ten;

/**
 * Created by liferay on 8/11/2017.
 */
public class NumberSeperator {

    int OGNum;
    int a, b, c, d;

    public void seperate(int num) {

        OGNum = num;

        a = num % 10;
        OGNum = num / 10;
        System.out.println(a + " " + OGNum);

        b = OGNum % 10;
        OGNum /= 10;
        System.out.println(b + " " + OGNum);

        c = OGNum % 10;
        OGNum /= 10;
        System.out.println(c + " " + OGNum);

        d = OGNum % 10;
        OGNum /= 10;
        System.out.println(d + " " + OGNum);
    }

}
