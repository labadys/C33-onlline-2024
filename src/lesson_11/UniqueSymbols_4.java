package lesson_11;

import java.util.Scanner;

import static lesson_11.HasUniqueCharsClass.hasUniqueChars;

public class UniqueSymbols_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = sc.nextLine();

        System.out.print("Введите вторую строку: ");
        String str2 = sc.nextLine();

        System.out.print("Введите третью строку: ");
        String str3 = sc.nextLine();

        String[] strs = {str1, str2, str3};

        for (String str : strs) {
            if (hasUniqueChars(str)) {
                System.out.println("Слово с уникальными символами: " + str);
                break;
            }
        }
    }
}
