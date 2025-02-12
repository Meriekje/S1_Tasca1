package org.example.nivell2;

class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo");
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is ringing");
    }
}
