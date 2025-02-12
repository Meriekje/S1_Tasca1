package org.example.nivell2;

class Phone {
    protected String brand;
    protected String model;

    public Phone(String marca, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(String number) {
        System.out.println("Calling number: " + number);
    }
}
