package org.example.nivell1.e1_grupmusic;

public class Main {
    public static void main(String[] args) {
        Wind flute = new Wind("Flute", 300.0);  //object 1
        StringInstrument guitar = new StringInstrument("Guitar", 200.0);  //object 2
        Percussion drum = new Percussion("Drum", 400.0);  //object 3

        flute.play();
        guitar.play();
        drum.play();
    }
}