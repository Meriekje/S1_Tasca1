package org.example.nivell1.e2_cotxe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Cotxe {
    public static final String marca = "Toyota";
    public static String model = "Corolla";
    public final int potencia;

    public Cotxe(int potencia) {
        this.potencia = potencia;
    }

    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }
}
