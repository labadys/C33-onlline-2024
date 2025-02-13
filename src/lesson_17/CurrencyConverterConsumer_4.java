package lesson_17;

import java.util.Scanner;
import java.util.function.Consumer;

public class CurrencyConverterConsumer_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в формате 'число BYN': ");
        String input = scanner.nextLine();

        double exchangeRate = 0.32674;

        Consumer<String> convertAndPrint = str -> {
            String[] parts = str.split(" ");
            double amountBYN = Double.parseDouble(parts[0]);
            double amountUSD = amountBYN * exchangeRate;
            System.out.printf("Эквивалент в долларах на 13.02.2025: %.2f USD%n", amountUSD);
        };

        convertAndPrint.accept(input);
    }
}