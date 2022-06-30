package ejercicio17;

public class Lavadora extends Electrodomestico {

    double carga = 5;

    public Lavadora() {
    }

    public Lavadora(double baseprice, double weight) {
        super(baseprice, weight);
    }

    public Lavadora(double baseprice, String color, char consume, double weight, double carga) {
        super(baseprice, color, consume, weight);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double carga = 0;
        double precio = super.precioFinal();

        if(this.carga > 30)
            carga = 50;

        return (precio + carga);
    }
}
