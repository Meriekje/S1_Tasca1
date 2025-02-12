package org.example.nivell1.e1_grupmusic;

abstract class Instrument {
    protected String name;
    protected double price;

    static {
        System.out.println("An instrument is being initialized");
    }

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("An instrument has been created.");
    }

    public abstract void play();

}
