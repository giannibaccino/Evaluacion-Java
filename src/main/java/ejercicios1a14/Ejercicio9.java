package ejercicios1a14;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase = "La sonrisa sera la mejor arma contra la tristeza ";
        System.out.println("Agregue una frase a concatenar:");
        String nueva  = frase.replaceAll("a","e").concat(leer.nextLine());
        System.out.println(nueva);
    }
}
