package ejercicios1a14;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Inserte una frase para quitarle los espacios:");
        String frase = leer.nextLine();
        System.out.println(frase.replaceAll(" ", ""));
    }
}
