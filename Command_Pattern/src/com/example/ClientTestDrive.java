package com.example;

public class ClientTestDrive {


    public static void main(String[] args) {
        //Ac obj
        AirConditioner airConditioner = new AirConditioner();

        // Remote
        RemoteControl remote = new RemoteControl();

        // create command
        remote.setCommand(new TurnACOnCommand(airConditioner));
        remote.pressButton();

        // undo the last operation
        remote.undo();
    }
}
