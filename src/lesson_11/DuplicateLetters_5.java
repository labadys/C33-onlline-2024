package lesson_11;

import java.util.Scanner;

public class DuplicateLetters_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            result.append(c).append(c);
        }

        System.out.println("Результат: " + result.toString());
    }
}
