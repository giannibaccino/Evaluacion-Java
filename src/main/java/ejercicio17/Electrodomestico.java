package ejercicio17;

public class Electrodomestico {
    //atributos heredables
    double baseprice = 100;
    String color = "blanco"; //negro,rojo,azul y gris
    char consume = 'F';
    double weight = 5;

    public Electrodomestico(){}

    public Electrodomestico(double baseprice, double weight){
        this.baseprice = baseprice;
        this.weight = weight;
    }

    public Electrodomestico(double baseprice, String color, char consume, double weight) {
        this.baseprice = baseprice;
        this.color = color;
        this.consume = consume;
        this.weight = weight;
    }

    public double getBaseprice() {
        return baseprice;
    }

    public String getColor() {
        return color;
    }

    public char getConsume() {
        return consume;
    }

    public double getWeight() {
        return weight;
    }

    public void comprobarConsumoEnergetico(char letra){
        if(letra != 'A' || letra != 'B' || letra != 'C' || letra != 'D' || letra != 'E' || letra != 'F')
            this.consume = 'F';
    }

    public void comprobarColor(String color){
        if(!color.equalsIgnoreCase("blanco") || !color.equalsIgnoreCase("negro") || !color.equalsIgnoreCase("rojo") || !color.equalsIgnoreCase("azul") || !color.equalsIgnoreCase("gris"))
            this.color = "blanco";
    }

    public double precioFinal(){
        double x = 0;
        double y = 0;

        switch (this.consume){
            case 'A':
                x = 100;
                break;
            case 'B':
                x = 80;
                break;
            case 'C':
                x = 60;
                break;
            case 'D':
                x = 50;
                break;
            case 'E':
                x = 30;
                break;
            case 'F':
                x = 10;
                break;
        }

        if(this.weight <= 19)
            y = 10;
        else if(this.weight >= 20 && this.weight <= 49)
            y = 50;
        else if(this.weight >= 50 && this.weight <= 79)
            y = 80;
        else
            y = 100;
        return (this.baseprice + x + y);
    }
}
