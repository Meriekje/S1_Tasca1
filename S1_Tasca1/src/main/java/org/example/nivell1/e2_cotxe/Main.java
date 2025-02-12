package org.example.nivell1.e2_cotxe;

public class Main {
    public static void main(String[] args) {
        Car.brake();
        Car car1 = new Car(250);
        car1.accelerate();

        System.out.println("Brand: " + Car.BRAND);
        System.out.println("Initial model: " + Car.model);
        System.out.println("Power: " + car1.POWER);

        Car.model = "Yaris";
        System.out.println("Modified model: " + Car.model);

    }
}
