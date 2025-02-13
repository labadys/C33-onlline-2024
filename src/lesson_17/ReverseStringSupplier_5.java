package lesson_17;

import java.util.Scanner;
import java.util.function.Supplier;

public class ReverseStringSupplier_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку:");
        String input = scanner.nextLine();

        Supplier<String> reverseString = () -> new StringBuilder(input).reverse().toString();

        System.out.println("Перевёрнутая строка: " + reverseString.get());
    }
}
