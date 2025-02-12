package org.example.nivell2;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21");

        smartphone.call("699612193");
        smartphone.takePhoto();
        smartphone.alarm();
    }
}