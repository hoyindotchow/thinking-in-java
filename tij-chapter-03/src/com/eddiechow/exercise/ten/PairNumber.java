package com.eddiechow.exercise.ten;

/**
 * Created by liferay on 8/11/2017.
 */
public class PairNumber {

    int pair1, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12;
    int testVamp1, testVamp2,testVamp3,testVamp4,testVamp5,testVamp6, testVamp7, testVamp8, testVamp9, testVamp10, testVamp11, testVamp11, testVamp12;

    public void pair(NumberSeperator sep, int testVampNum) {

        pair1 = sep.a * 10 + sep.b;
        System.out.println(pair1);
        if(pair1 == testVampNum)
            System.out.println(testVampNum + " is a Vampire number")
            break;

        pair2 = sep.b * 10 + sep.a;
        System.out.println(pair2);
        if(pair2 == testVampNum)
            System.out.println(testVampNum + " is a Vampire number")
            break;

        pair3 = sep.a * 10 + sep.c;
        System.out.println(pair3);
        if(pair3 == testVampNum)
            System.out.println(testVampNum + " is a Vampire number")
            break;

        pair4 = sep.c * 10 + sep.a;
        System.out.println(pair4);
        if(pair4 == testVampNum)
            System.out.println(testVampNum + " is a Vampire number")
            break;

        pair5 = sep.a * 10 + sep.d;
        System.out.println(pair5);
        if(pair5 == testVampNum)
            System.out.println(testVampNum + " is a Vampire number")
            break;

        pair6 = sep.d * 10 + sep.a;
        System.out.println(pair6);
        if(pair6 == testVampNum)
            System.out.println(testVampNum + " is a Vampire number")
            break;

        pair7 = sep.b * 10 + sep.c;
        System.out.println(pair7);
        if(pair7 == testVampNum)
            System.out.println(testVampNum + " is a Vampire number")
            break;

        pair8 = sep.c * 10 + sep.b;
        System.out.println(pair8);
        if(pair8 == testVampNum)
            System.out.println(testVampNum + " is a Vampire number")
            break;

        pair9 = sep.b * 10 + sep.d;
        System.out.println(pair9);
        if(pair9 == testVampNum)
            System.out.println(testVampNum + " is a Vampire number")
            break;

        pair10 = sep.d * 10 + sep.b;
        System.out.println(pair10);
        if(pair10 == testVampNum)
            System.out.println(testVampNum + " is a Vampire number")
            break;

        pair11 = sep.c * 10 + sep.d;
        System.out.println(pair11);
        if(pair11 == testVampNum)
            System.out.println(testVampNum + " is a Vampire number")
            break;

        pair12 = sep.d * 10 + sep.c;
        System.out.println(pair12);
        if(pair12 == testVampNum)
            System.out.println(testVampNum + " is a Vampire number")
            break;
    }
}
