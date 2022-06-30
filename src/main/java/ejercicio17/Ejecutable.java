package ejercicio17;

public class Ejecutable {
    public static void main(String[] args) {
        Electrodomestico array[] ;
        array = new Electrodomestico[10];
        array[0] = new Lavadora();
        array[1] = new Electrodomestico (150, 10);
        array[2] = new Electrodomestico();
        array[3] = new Electrodomestico(150, "azul", 'D', 90);
        array[4] = new Lavadora(200, 40);
        array[5] = new Lavadora(150, "gris", 'C', 60, 35);
        array[6] = new Television();
        array[7] = new Television(500, 70);
        array[8] = new Television();
        array[9] = new Television(200, "negro", 'A', 35, 55, true);

        double e = 0;
        double l = 0;
        double t = 0;

        for(int i = 0; i < array.length; i++){
            array[i].comprobarColor(array[i].getColor());
            array[i].comprobarConsumoEnergetico(array[i].getConsume());
            if(array[i] instanceof Television)
                t += array[i].precioFinal(); 
            else if(array[i] instanceof  Lavadora)
                l += array[i].precioFinal();
            else
                e += array[i].precioFinal();
        }
        e += t + l;
        System.out.printf("Precio final de electrodomesticos: %.2f", e);
        System.out.printf("€" + "\n" + "Precio final de lavadoras: %.2f", l);
        System.out.printf("€" + "\n" + "Precio final de televisiones: %.2f", t);
        System.out.println("€");


        System.out.println(array[0].precioFinal());
        System.out.println(array[4].precioFinal());
        System.out.println(array[5].precioFinal());
    }
}
