package org.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> n = getNumbers();
        System.out.println(n);
    }

    public static List<Integer> getNumbers() {
        List<Integer> numere = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numere.add(i);
        }
        return numere;
    }
}
