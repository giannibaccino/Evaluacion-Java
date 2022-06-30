package ejercicios1a14;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Inserte un dia de la semana:");
        String dia = leer.nextLine();
        switch (dia.toLowerCase()){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Dia laborable");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Dia no laborable");
                break;
            default:
                System.out.println("No inserto un dia valido");
        }
    }
}
