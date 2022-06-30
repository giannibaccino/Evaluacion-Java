package ejercicio17;

import java.util.ArrayList;

public class Ejecutable {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> array = new ArrayList<>(10);
        array.add(new Lavadora());
        array.add(new Electrodomestico (150, 10));
        array.add(new Electrodomestico());
        array.add(new Electrodomestico(150, "azul", 'D', 90));
        array.add(new Lavadora(200, 40));
        array.add(new Lavadora(150, "gris", 'C', 60, 35));
        array.add(new Television());
        array.add(new Television(500, 70));
        array.add(new Television());
        array.add(new Television(200, "negro", 'A', 35, 55, true));

        double electros = 0;
        double lavas = 0;
        double teles = 0;

        for(Electrodomestico elemento : array){
            if(elemento instanceof Television)
                teles += elemento.precioFinal();
            else if(elemento instanceof  Lavadora)
                lavas += elemento.precioFinal();
            else
                electros += elemento.precioFinal();
        }
        electros += teles + lavas;
        System.out.printf("Precio final de electrodomesticos: %.2f", electros);
        System.out.printf("€" + "\n" + "Precio final de lavadoras: %.2f", lavas);
        System.out.printf("€" + "\n" + "Precio final de televisiones: %.2f", teles);
        System.out.println("€");

    }
}
