package lesson_11;

import java.util.Scanner;

public class ShortestLongestFinder_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String str1 = sc.nextLine();

        System.out.print("Введите вторую строку: ");
        String str2 = sc.nextLine();

        System.out.print("Введите третью строку: ");
        String str3 = sc.nextLine();

        String shortest = str1, longest = str1;

        if (str2.length() < shortest.length()) shortest = str2;
        if (str3.length() < shortest.length()) shortest = str3;
        if (str2.length() > longest.length()) longest = str2;
        if (str3.length() > longest.length()) longest = str3;

        System.out.println("Самая короткая строка: \"" + shortest + "\" длина: " + shortest.length());
        System.out.println("Самая длинная строка: \"" + longest + "\" длина: " + longest.length());


    }
}
