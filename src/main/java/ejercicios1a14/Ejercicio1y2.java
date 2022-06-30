package ejercicios1a14;

import java.util.Scanner;

public class Ejercicio1y2 {
    public void mayor(double n1, double n2){
        if(n1 > n2)
            System.out.println(n1 + " es mayor que " + n2);
        else if(n1 < n2)
            System.out.println(n1 + " es menor que " + n2);
        else
            System.out.println(n1 + " es igual que " + n2);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Inserte el primer numero: ");
        double n1 = leer.nextDouble();
        System.out.println("Inserte el segundo numero: ");
        double n2 = leer.nextDouble();
        Ejercicio1y2 run = new Ejercicio1y2();
        run.mayor(n1, n2);
    }
}
