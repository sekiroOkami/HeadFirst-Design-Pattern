package com.example;

/**
 * Problem
 * 1. lack of Abstraction:
 * process of turning on AC is easy, but if there are more steps, client has to aware all of that which is not good.
 * 2. Undo/Redo Functionality:
 * WHat if i want to implement the undo/redo capability. how it will be handled.
 * 3. Difficulty in code maintenance.
 * in the future, we have to support more commands for more devices.
 *
 * Client --> have to had a knowledge of turnOnAC(), turnOffAC(), setTemperature
 */
public class AirClient {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOnAC();
        airConditioner.setTemperature(24);
        airConditioner.turnOffAC();
    }
}
