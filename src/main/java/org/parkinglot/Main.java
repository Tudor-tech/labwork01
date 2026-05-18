package org.parkinglot;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> n = getNumbers();
        List<Integer> even =  filterEvenNumbers(n);
        List<Integer> odd =  filterOddNumbers(n);
        System.out.println(odd);
    }

    public static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    public static List<Integer> filterEvenNumbers(List<Integer> lista) {
        List<Integer> even = new ArrayList<>();
        for(Integer i : lista) {
            if (i % 2 == 0) {
                even.add(i);
            }
        }
        return even;
    }

    public static List<Integer> filterOddNumbers(List<Integer> lista1) {
        List<Integer> odd = new ArrayList<>();
        for(Integer i : lista1) {
            if (i % 2 != 0) {
                odd.add(i);
            }
        }
        return odd;
    }
}
