package ejercicios1a14;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in)
                ;
        System.out.println("Inserte una palabra:");
        String pal1 = leer.nextLine();

        System.out.println("Inserte otra palabra:");
        String pal2 = leer.nextLine();

        if(pal1.equalsIgnoreCase(pal2))
            System.out.println("Las palabras son iguales");
        else{
            System.out.println("Las palabras no son iguales");
            String dif = "";
            int largo = Math.max(pal1.length(), pal2.length());
            for(int i = 0; i < largo; i++){
                if(largo == pal1.length()){
                    if(i >= pal2.length())
                       dif = dif.concat(String.valueOf(pal1.charAt(i)));
                    else if(!(pal1.charAt(i) == pal2.charAt(i)))
                       dif = dif.concat(String.valueOf(pal1.charAt(i)));
                }
                else{
                    if(i >= pal1.length())
                       dif = dif.concat(String.valueOf(pal2.charAt(i)));
                    else if(!(pal1.charAt(i) == pal2.charAt(i)))
                       dif = dif.concat(String.valueOf(pal2.charAt(i)));
                }
            }
            System.out.println("Diferencias: " + dif);
        }
    }
}
