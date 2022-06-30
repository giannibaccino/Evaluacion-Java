package ejercicios1a14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Inserte un numero entero: ");
        int n = leer.nextInt();

        for(int i = n; i <= 1000; i += 2){
            System.out.println(i);
        }
    }
}
