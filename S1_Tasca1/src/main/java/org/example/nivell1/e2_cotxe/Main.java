package org.example.nivell1.e2_cotxe;

public class Main { 	// Classe principal per demostrar l'ús
    public static void main(String[] args) {
        Cotxe.frenar();
        Cotxe cotxe1 = new Cotxe(250);
        cotxe1.accelerar();

        System.out.println("Marca: " + Cotxe.marca);
        System.out.println("Model inicial: " + Cotxe.model);
        System.out.println("Potència: " + cotxe1.potencia);

        Cotxe.model = "Yaris";
        System.out.println("Model modificat: " + Cotxe.model);

    }
}
