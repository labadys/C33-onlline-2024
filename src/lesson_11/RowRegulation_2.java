package lesson_11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RowRegulation_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = sc.nextLine();

        System.out.print("Введите вторую строку: ");
        String str2 = sc.nextLine();

        System.out.print("Введите третью строку: ");
        String str3 = sc.nextLine();

        String[] strs = {str1, str2, str3};

        Arrays.sort(strs, Comparator.comparingInt(String::length));

        System.out.println("Строки по возрастанию длины:");
        for (String str : strs) {
            System.out.println(str + " (длина: " + str.length() + ")");
        }
    }
}
