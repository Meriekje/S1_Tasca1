package org.example.nivell1.e1_grupmusic;

class Wind extends Instrument {
    public Wind(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing: " + name);

    }
}
