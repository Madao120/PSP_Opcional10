package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Hilo10 hiloPares = new Hilo10("pares");
        Hilo10 hiloImpares = new Hilo10("impares");
        Hilo10 hiloTresCuatro = new Hilo10("trescuatro");

        hiloPares.start();
        hiloImpares.start();
        hiloTresCuatro.start();
    }
}
