package org.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> n = getNumbers();
        List<Integer> even =  getEvenNumbers(n);
        List<Integer> odd =  getOddNumbers(n);
        System.out.println(odd);
    }

    public static List<Integer> getNumbers() {
        List<Integer> numere = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numere.add(i);
        }
        return numere;
    }

    public static List<Integer> getEvenNumbers(List<Integer> lista) {
        List<Integer> numere1 = new ArrayList<>();
        for(Integer i : lista) {
            if (i % 2 == 0) {
                numere1.add(i);
            }
        }
        return numere1;
    }

    public static List<Integer> getOddNumbers(List<Integer> lista1) {
        List<Integer> numere2 = new ArrayList<>();
        for(Integer i : lista1) {
            if (i % 2 != 0) {
                numere2.add(i);
            }
        }
        return numere2;
    }
}
