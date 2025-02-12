package org.example.nivell1.e1_grupmusic;

class Vent extends Instrument {
    public Vent(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de vent: " + nom);

    }
}
