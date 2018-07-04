package com.eddiechow.exercise.five_05.object.create;

import com.eddiechow.exercise.five_05.PublicPrivateProtectedTest;

public class CreateObjectTest {
    public static void main(String[] args){

        PublicPrivateProtectedTest accessObject = new PublicPrivateProtectedTest();

        System.out.println(accessObject.publicMessage);
       // System.out.println(accessObject.protectedMessage);
       // System.out.println(accessObject.privateMessage);

        accessObject.printPrivateMessage("Here is my Private Message");
        accessObject.printProtectedMessage("Here is my Protected Message");
    }
}
