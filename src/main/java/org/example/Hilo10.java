package org.example;

public class Hilo10 extends Thread{
    String modo;
    long suma;

    public Hilo10(String modo){
        this.modo = modo;
    };

    @Override
    public void run(){
        for (int i = 0; i < 1923; i++) {
            if (modo == "pares" && i%2 == 0){
                suma += i;
            }
            if (modo == "impares" && i%2 == 1){
                suma += i;
            }
            // No sabía como sacar el último número, por lo que se lo comenté a al IA y tiene sentido que al dividir por 10 el resto sea lo último siempre.
            if (modo == "trescuatro" && i%10 == 3){
                suma += i;
            }
            if (modo == "trescuatro" && i%10 == 4){
                suma += i;
            }
        }

        if (modo == "pares" || modo == "impares"){
            System.out.println("La suma de los " + modo + " es " + suma);
        }
        else if (modo == "trescuatro") {
            System.out.println("La suma de los número que terminan en 3 o 4 es de " + suma);
        }

    }

}
