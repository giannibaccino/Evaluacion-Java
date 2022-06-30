package Ejercicio16;

import java.lang.reflect.GenericArrayType;

public class Persona {
    private String name = "";
    private int age = 0;
    private int id;
    private char sex = 'H';
    private double weight = 0;
    private double height = 0;
    private int imc;

    public Persona(){}

    public Persona(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Persona(String name, int age, int id, char sex, double weight, double height, int imc) {
        this.name = name;
        this.age = age;
        this.id = id;
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
                ", DNI:" + id +
                ", Sexo:" + sex +
                ", Peso:" + weight + "kg" +
                ", Altura:" + height + "m" +
                '}';
    }

    public void generarDNI(){
        this.id = (int) (Math.random() * 100000000);
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
