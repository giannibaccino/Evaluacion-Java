package ejercicios1a14;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {

    public static void main(String[] args) {
        List<Integer> even= new ArrayList<>();
        List<Integer> odd= new ArrayList<>();
        for(int i = 1; i <= 100; i++) {
            if ((i % 2) == 0)
                even.add(i);
            else
                odd.add(i);
        }
        System.out.println("Pares:");
        even.forEach(System.out::println);
        System.out.println("Impares:");
        odd.forEach(System.out::println);
    }
}
