package org.example.nivell1.e1_grupmusic;

abstract class Instrument {
    protected String nom;
    protected double preu;

    static {
        System.out.println("S'està inicialitzant un instrument.");
    }

    public Instrument(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
        System.out.println("S'ha creat un instrument.");
    }

    public abstract void tocar();

}
