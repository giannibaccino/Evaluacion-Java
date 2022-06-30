package ejercicios1a14;

import java.util.Scanner;

public class Ejercicio4 {
    final double iva = 1.21;

    public double precioMasIVA(double p){
        return iva * p;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ejercicio4 run = new Ejercicio4();
        System.out.println("Inserte el precio del producto: ");
        System.out.printf("El precio final con IVA es: $%.2f", run.precioMasIVA(leer.nextDouble()));
    }
}
