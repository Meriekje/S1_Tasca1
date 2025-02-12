package org.example.nivell1.e1_grupmusic;

class Percussion extends Instrument {
    public Percussion(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing: " + name);

    }


}
