
package com.mycompany.java.lab;


public class TrafficLightSystem {

    
    public static void main(String[] args) {
       TrafficLight greenLight = new TrafficLight("Green", 10000); // Green light duration: 10 seconds
        TrafficLight redLight = new TrafficLight("Red", 8000);       // Red light duration: 8 seconds
        TrafficLight yellowLight = new TrafficLight("Yellow", 2000); // Yellow light duration: 2 seconds

        greenLight.start();
        redLight.start();
        yellowLight.start();
    }
    
}
