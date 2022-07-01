package Ejercicio16;

import java.util.Scanner;

public class Ejecutable {

    public void mostrarEstadoFisico(Persona persona){
        if(persona.getImc() == -1)
            System.out.println(persona.getName() + " esta por debajo de su peso");
        else if(persona.getImc() == 1)
            System.out.println(persona.getName() + " tiene sobrepeso");
        else
            System.out.println(persona.getName() + " esta en su peso ideal");
    }

    public void mostrarMayoria(Persona persona){
        if(persona.esMayorDeEdad())
            System.out.println(persona.getName() + " es mayor de edad");
        else
            System.out.println(persona.getName() + " es menor de edad");
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String name = leer.nextLine();
        System.out.println("Ingresa tu edad");
        int age = leer.nextInt();
        System.out.println("Ingresa tu sexo (H o M)");
        char sex = leer.next().charAt(0);
        System.out.println("Ingresa tu peso en kg");
        double weight = leer.nextDouble();
        System.out.println("Ingresa tu altura en m");
        double height = leer.nextDouble();

        Persona p1 = new Persona(name, age, 0,'T', sex, weight, height, 0);
        p1.setImc(p1.calcularIMC());

        Persona p2 = new Persona(name, age, sex);
        p2.setWeight(92.5);
        p2.setHeight(1.89);
        p2.setImc(p2.calcularIMC());

        Persona p3 = new Persona();
        p3.setName("Marta");
        p3.setAge(27);
        p3.setSex('M');
        p3.setWeight(65.1);
        p3.setHeight(1.73);
        p3.setImc(p3.calcularIMC());

        Ejecutable run = new Ejecutable();

        run.mostrarEstadoFisico(p1);
        run.mostrarMayoria(p1);
        System.out.println(p1.toString());

        run.mostrarEstadoFisico(p2);
        run.mostrarMayoria(p2);
        System.out.println(p2.toString());

        run.mostrarEstadoFisico(p3);
        run.mostrarMayoria(p3);
        System.out.println(p3.toString());
    }
}
