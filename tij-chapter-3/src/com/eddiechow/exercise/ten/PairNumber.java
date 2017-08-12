package com.eddiechow.exercise.ten;

/**
 * Created by liferay on 8/11/2017.
 */
public class PairNumber {

    int pair1, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12;

    public void pair(NumberSeperator sep) {
        pair1 = sep.a * 10 + sep.b;
        System.out.println(pair1);

        pair2 = sep.b * 10 + sep.a;
        System.out.println(pair2);

        pair3 = sep.a * 10 + sep.c;
        System.out.println(pair3);

        pair4 = sep.c * 10 + sep.a;
        System.out.println(pair4);

        pair5 = sep.a * 10 + sep.d;
        System.out.println(pair5);

        pair6 = sep.d * 10 + sep.a;
        System.out.println(pair6);

        pair7 = sep.b * 10 + sep.c;
        System.out.println(pair7);

        pair8 = sep.c * 10 + sep.b;
        System.out.println(pair8);

        pair9 = sep.b * 10 + sep.d;
        System.out.println(pair9);

        pair10 = sep.d * 10 + sep.b;
        System.out.println(pair10);

        pair11 = sep.c * 10 + sep.d;
        System.out.println(pair11);

        pair12 = sep.d * 10 + sep.c;
        System.out.println(pair12);
    }
}
