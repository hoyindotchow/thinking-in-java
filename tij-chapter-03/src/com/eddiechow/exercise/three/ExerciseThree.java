package com.eddiechow.exercise.three;

/**
 * Created by liferay on 8/7/2017.
 */

import java.util.Random;

/**
 * Created by liferay on 8/7/2017.
 */
public class ExerciseThree {
    public static void main(String[] args){
        Random rando = new Random();
        int l = 0;

        while(l==0){
            for(int i = 0; i<25; i++){
                int j = rando.nextInt();
                int k = rando.nextInt();

                if(j<k){
                    System.out.println("This is J: " + j + '\n' +"This is K: " + k);
                    System.out.println("J is less than K" + '\n');
                }
                else if(j>k){
                    System.out.println("This is J: " + j + '\n' +"This is K: " + k);
                    System.out.println("J is greater than K" +'\n');
                }
                else{
                    System.out.println("This is J: " + j + '\n' +"This is K: " + k);
                    System.out.println("J and K are equal" +'\n');
                }
            }
        }
    }
}
