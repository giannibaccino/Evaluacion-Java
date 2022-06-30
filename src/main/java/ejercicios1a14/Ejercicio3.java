package ejercicios1a14;

import java.util.Scanner;

public class Ejercicio3 {

    public double areaCirculo(double r){
        return Math.PI * Math.pow(r, 2);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Ejercicio3 run = new Ejercicio3();
        System.out.println("Inserte el radio del circulo:");
        System.out.printf("El area del circulo es: %.3f", run.areaCirculo(leer.nextDouble()));
    }
}
