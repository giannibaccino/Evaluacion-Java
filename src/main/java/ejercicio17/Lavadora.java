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

    public double precioFinal(){
        double x = 0;
        if(this.carga > 30)
            x = 50;
        return super.precioFinal() + x;
    }
}
