package lesson_18;

import java.util.*;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6, 8, 8, 10);

        int sum = numbers.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма оставшихся элементов: " + sum);
    }
}