package org.example.nivell1.e2_cotxe;

class Car {
    public static final String BRAND = "Toyota";
    public static String model = "Corolla";
    public final int POWER;

    public Car(int POWER) {
        this.POWER = POWER;
    }

    public static void brake() {
        System.out.println("The vehicle is braking");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating");
    }
}
