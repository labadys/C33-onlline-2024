package lesson_17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HundredYearsOld_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вашу дату рождения (формат: ГГГГ-ММ-ДД):");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate birthDate = LocalDate.parse(inputDate, formatter);

        LocalDate hundredYearsLater = birthDate.plusYears(100);

        System.out.println("Вам исполнится 100 лет: " + hundredYearsLater);
    }
}