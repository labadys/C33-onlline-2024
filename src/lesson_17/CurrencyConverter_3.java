package lesson_17;

import java.util.Scanner;
import java.util.function.Function;

public class CurrencyConverter_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в BYN: ");
        String input = scanner.nextLine();

        double exchangeRate = 3.2674;

        Function<String, Double> convertToUSD = str -> {
            String[] parts = str.split(" ");
            double amountBYN = Double.parseDouble(parts[0]);
            return amountBYN / exchangeRate;
        };

        double amountUSD = convertToUSD.apply(input);

        System.out.printf("Эквивалент в долларах на 13.02.2025: %.2f USD%n", amountUSD);
    }
}
