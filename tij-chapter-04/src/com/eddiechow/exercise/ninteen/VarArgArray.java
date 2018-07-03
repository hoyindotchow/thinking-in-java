package com.eddiechow.exercise.ninteen;

public class VarArgArray {
    void varArg(String... strArgList) {
        for (String str : strArgList) {
            System.out.println(str);
        }
    }
}
