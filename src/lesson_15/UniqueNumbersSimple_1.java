package lesson_15;

import java.util.*;
import java.util.Scanner;

public class UniqueNumbersSimple_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через запятую:");
        String input = scanner.nextLine();

        Set<String> uniqueNumbers = new HashSet<>(Arrays.asList(input.split(",")));

        System.out.println("Уникальные числа: " + uniqueNumbers);
    }
}
