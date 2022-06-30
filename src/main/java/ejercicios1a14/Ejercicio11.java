package ejercicios1a14;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();

        int as = 0;
        int es = 0;
        int is = 0;
        int os = 0;
        int us = 0;

        for(int i = 0; i<frase.length(); i++){
            switch(frase.toLowerCase().charAt(i)){
                case 'a':
                    as++;
                    break;
                case 'e':
                    es++;
                    break;
                case 'i':
                    is++;
                    break;
                case 'o':
                    os++;
                    break;
                case 'u':
                    us++;
                    break;
            }
        }
        System.out.println("Largo de la frase (incluye espacios): " + frase.length() +
                "\n" + "Cantidad de letras A: " + as + "\n" + "Cantidad de letras E: " + es +
                "\n" + "Cantidad de letras I: " + is + "\n" + "Cantidad de letras O: " + os +
                "\n" + "Cantidad de letras U: " + us );

    }
}
