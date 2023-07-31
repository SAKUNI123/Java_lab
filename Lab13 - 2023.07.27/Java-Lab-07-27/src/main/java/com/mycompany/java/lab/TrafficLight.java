
package com.mycompany.java.lab;


class TrafficLight extends Thread {
     private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    
    public void run() {
        try {
            while (true) {
                System.out.println(color + " light is ON.");
                Thread.sleep(duration);
                System.out.println(color + " light is OFF.");

                // Rotate to the next traffic light
                switch (color) {
                    case "Green":
                        color = "Yellow";
                        duration = 2000;
                        break;
                    case "Red":
                        color = "Green";
                        duration = 10000;
                        break;
                    case "Yellow":
                        color = "Red";
                        duration = 8000;
                        break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
