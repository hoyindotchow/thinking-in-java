package com.eddiechow.exercise.eight_08;

public class ConnectionManager {

    private static int arrayLength = 3;
    private Connection[] connectionManagerArray = new Connection[arrayLength];

    public ConnectionManager() {

        for (int i = 0; i > arrayLength - 1; i++) {
            connectionManagerArray[i] = Connection.makeConnection();
        }

    }

    public Connection displayConnection(int connectionNumber) {

        if (connectionNumber < arrayLength ) {
            System.out.println("Connection #:" + connectionNumber);
            return connectionManagerArray[connectionNumber];
        } else
            System.out.println("No More Connections");
            return null;

    }

    public static void main(String[] args) {

        ConnectionManager connectionManagerObject = new ConnectionManager();

        for(int i = 0; i<=arrayLength; i++){
            connectionManagerObject.displayConnection(i);
        }
    }
}

