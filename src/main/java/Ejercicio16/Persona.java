package Ejercicio16;

import java.lang.reflect.GenericArrayType;

public class Persona {
    private String name = "";
    private int age = 0;
    private int id;
    private char letraid;
    private char sex = 'H';
    private double weight = 0;
    private double height = 0;
    private int imc;

    public Persona(){
        this.id = generarDNI();
        this.letraid = generarLetraDni();
    }

    public Persona(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = generarDNI();
        this.letraid = generarLetraDni();
    }

    public Persona(String name, int age, int id, char letraid, char sex, double weight, double height, int imc) {
        this.name = name;
        this.age = age;
        this.id = generarDNI();
        this.letraid = generarLetraDni();
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.imc = imc;
    }

    public int calcularIMC(){
        int res = 0;
        double imc = this.weight / (Math.pow(this.height, 2));
        if(imc < 20)
            res = -1;
        else if(imc > 25)
            res = 1;
        return res;
    }

    public boolean esMayorDeEdad(){
        return this.age > 18;
    }

    public void comprobarSexo(char sex){
        if(sex != 'H' || sex != 'M')
            this.sex = 'H';
    }

    @Override
    public String toString() {
        return "Persona {" +
                "Nombre:'" + name + '\'' +
                ", Edad:" + age +
                ", DNI:" + letraid + "-" + id +
                ", Sexo:" + sex +
                ", Peso:" + weight + "kg" +
                ", Altura:" + height + "m" +
                '}';
    }

    public int generarDNI(){
        return (int) (Math.random() * 100000000);
    }

    public char generarLetraDni() {
        int resto = this.id % 23;
        char letra = 'T';
        switch (resto){
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
        }
        return letra;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getImc() {
        return imc;
    }


}
