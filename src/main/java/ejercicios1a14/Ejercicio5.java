package ejercicios1a14;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {
        List<Integer> even= new ArrayList<>();
        List<Integer> odd= new ArrayList<>();
        int i = 1;
        while (i <= 100) {
            if ((i % 2) == 0)
                even.add(i);
            else
                odd.add(i);
            i++;
        }
        System.out.println("Pares:");
        even.forEach(System.out::println);
        System.out.println("Impares:");
        odd.forEach(System.out::println);
    }
}
