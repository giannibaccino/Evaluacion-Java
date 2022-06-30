package ejercicios1a14;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int n = leer.nextInt();
        if(n >= 0)
            if(n > 0)
                System.out.println(n + " es mayor que 0");
            else
                System.out.println(n + " es igual que 0");
        else{
            while(n < 0){
                System.out.println("Este numero es menor que cero, ingrese otro numero: ");
                n = leer.nextInt();
            }
            if(n > 0)
                System.out.println(n + " es mayor que 0");
            else
                System.out.println(n + " es igual que 0");
        }
    }
}
