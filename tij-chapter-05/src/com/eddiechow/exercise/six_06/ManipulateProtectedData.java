package com.eddiechow.exercise.six_06;

    class CreateProtectedData {
        protected String protectedMessage;

    }
    public class ManipulateProtectedData{
        public static void main(String[] args){

            CreateProtectedData cpdObject = new CreateProtectedData();

            cpdObject.protectedMessage = "Display My Message";

            System.out.println(cpdObject.protectedMessage);

        }
    }

