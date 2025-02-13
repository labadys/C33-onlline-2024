package lesson_17;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.function.Predicate;


public class PositiveNumbersFilter_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа через пробел:");
        String input = scanner.nextLine();

        List<Integer> numbers = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Predicate<Integer> isPositive = num -> num > 0;

        List<Integer> positiveNumbers = numbers.stream()
                .filter(isPositive)
                .collect(Collectors.toList());

        System.out.println("Положительные числа: " + positiveNumbers);
    }
}