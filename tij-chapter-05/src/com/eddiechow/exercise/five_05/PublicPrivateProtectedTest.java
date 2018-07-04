package com.eddiechow.exercise.five_05;

public class PublicPrivateProtectedTest {

    public String publicMessage = "Public Access String";

    protected String protectedMessage = "Protected Access String";

    private String privateMessage = "Private Access String";

    public void printProtectedMessage(String protectedMessage){

        this.protectedMessage = protectedMessage;

        System.out.println(this.protectedMessage);
    }

    public void printPrivateMessage(String privateMessage){

        this.privateMessage = privateMessage;

        System.out.println(this.privateMessage);

    }
}
