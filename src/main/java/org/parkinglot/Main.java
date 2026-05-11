package org.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> n = getNumbers();
        List<Integer> even =  getEvenNumbers(n);
        System.out.println(even);
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
}
