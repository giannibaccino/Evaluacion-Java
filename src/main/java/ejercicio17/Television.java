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

    public double precioFinal(){
        double x = 1;
        double y = 0;

        if(this.res > 40)
            x = 1.3;
        if(this.tdt)
            y = 50;
        return (super.precioFinal() + y) * x;
    }
}
