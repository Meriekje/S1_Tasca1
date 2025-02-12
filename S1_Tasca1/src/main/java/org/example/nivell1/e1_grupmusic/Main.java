package org.example.nivell1.e1_grupmusic;

public class Main {
    public static void main(String[] args) {
        Vent flauta = new Vent("Flauta", 300.0);
        Corda guitarra = new Corda("Guitarra", 200.0);
        Percussio tambor = new Percussio("Tambor", 400.0);

        flauta.tocar();
        guitarra.tocar();
        tambor.tocar();
    }
}