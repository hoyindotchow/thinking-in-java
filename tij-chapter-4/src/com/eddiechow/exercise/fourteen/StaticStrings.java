package com.eddiechow.exercise.fourteen;

public class StaticStrings {

    static String staticStr = "String 1";
    static String staticStr2;

    static {
            staticStr2 = "String 2";
        }

        public static void printStaticStrings(){
            System.out.println(staticStr);
            System.out.println(staticStr2);
        }
    }

