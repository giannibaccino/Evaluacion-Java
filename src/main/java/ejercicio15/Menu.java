package ejercicio15;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean exit = false;
        int elem;

        while(!exit) {
            System.out.println("*******GESTION CINEMATOGRAFICA*******" +
                    "\n" + "1-NUEVO ACTOR" + "\n" + "2-BUSCAR ACTOR" +
                    "\n" + "3-ELIMINAR ACTOR" + "\n" + "4-MODIFICAR ACTOR" +
                    "\n" + "5-VER TODOS LOS ACTORES" + "\n" + "6-VER PELICULAS DE LOS ACTORES" +
                    "\n" + "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" + "\n" + "8-SALIR");

            elem = leer.nextInt();
            switch (elem) {
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        }
    }
}
