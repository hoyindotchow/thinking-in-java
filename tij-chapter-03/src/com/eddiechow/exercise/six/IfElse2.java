package com.eddiechow.exercise.six;

/**
 * Created by liferay on 8/10/2017.
 */
public class IfElse2 {
    static int test(int begin, int testval, int end) {
        if (testval >= begin && testval <=end)
            return +1;
        else
            return -1;
    }
}
