package org.parkinglot;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> numbers = getNumbers();
        numbers.stream().forEach(number -> System.out.println(number)) ;
    }

    public static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}
