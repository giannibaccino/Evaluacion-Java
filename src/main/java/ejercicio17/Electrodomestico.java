package ejercicio17;

public class Electrodomestico {
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
        this.color = comprobarColor(color);
        this.consume = comprobarConsumoEnergetico(consume);
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

    public char comprobarConsumoEnergetico(char letra){
        if(letra != 'A' || letra != 'B' || letra != 'C' || letra != 'D' || letra != 'E' || letra != 'F')
            return 'F';
        else
            return letra;
    }

    public String comprobarColor(String color){
        if(!color.equalsIgnoreCase("blanco") || !color.equalsIgnoreCase("negro") || !color.equalsIgnoreCase("rojo") || !color.equalsIgnoreCase("azul") || !color.equalsIgnoreCase("gris"))
            return "blanco";
        else
            return color;
    }

    public double precioFinal(){
        double consumo = 0;
        double peso = 0;

        switch (this.consume){
            case 'A':
                consumo = 100;
                break;
            case 'B':
                consumo = 80;
                break;
            case 'C':
                consumo = 60;
                break;
            case 'D':
                consumo = 50;
                break;
            case 'E':
                consumo = 30;
                break;
            case 'F':
                consumo = 10;
                break;
        }

        if(this.weight <= 19)
            peso = 10;
        else if(this.weight >= 20 && this.weight <= 49)
            peso = 50;
        else if(this.weight >= 50 && this.weight <= 79)
            peso = 80;
        else
            peso = 100;

        return (this.baseprice + consumo + peso);
    }
}
