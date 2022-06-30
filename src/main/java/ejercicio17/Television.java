package ejercicio17;

public class Television extends Electrodomestico {

    double res = 20;
    boolean tdt = false;

    public Television() {
    }

    public Television(double baseprice, double weight) {
        super(baseprice, weight);
    }

    public Television(double baseprice, String color, char consume, double weight, double res, boolean tdt) {
        super(baseprice, color, consume, weight);
        this.res = res;
        this.tdt = tdt;
    }

    public double getRes() {
        return res;
    }

    public boolean isTdt() {
        return tdt;
    }

    @Override
    public double precioFinal() {
        double res = 1;
        double tdt = 0;
        double precio = super.precioFinal();

        if(this.res > 40)
            res = 1.3;
        if(this.tdt)
            tdt = 50;
        return (precio + tdt) * res;
    }
}
