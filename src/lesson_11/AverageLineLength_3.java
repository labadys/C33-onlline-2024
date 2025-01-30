package lesson_11;

import java.util.Scanner;

public class AverageLineLength_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = sc.nextLine();

        System.out.print("Введите вторую строку: ");
        String str2 = sc.nextLine();

        System.out.print("Введите третью строку: ");
        String str3 = sc.nextLine();

        String[] strs = {str1, str2, str3};
        int totalLength = str1.length() + str2.length() + str3.length();
        double averageLength = totalLength / 3.0;

        System.out.println("Средняя длина: " + averageLength);

        System.out.println("Строки, длина которых меньше средней:");
        for (String str : strs) {
            if (str.length() < averageLength) {
                System.out.println(str + " (длина: " + str.length() + ")");
            }
        }
    }
}