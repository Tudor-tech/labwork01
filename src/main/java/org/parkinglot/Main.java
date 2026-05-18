package org.parkinglot;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> numbers = getNumbers();
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    public static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}
