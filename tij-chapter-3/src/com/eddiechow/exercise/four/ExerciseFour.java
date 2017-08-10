package com.eddiechow.exercise.four;

/**
 * Created by liferay on 8/9/2017.
 */
public class ExerciseFour {
    public static void main(String[] args){
        for(int i = 2; i < 100; i++){
            for(int j = 2; j <= i; j++){
                if (i==j){          //Getting to the end of the loop means that there wasn't a number that could evenly divide i except itself
                    System.out.println(i + " Is Prime");
                }
                if (i % j == 0){    //If a number,j, can evenly divide i, then i, is not prime and we can exit out the inner loop
                    break;
                }

            }
        }
    }
}
