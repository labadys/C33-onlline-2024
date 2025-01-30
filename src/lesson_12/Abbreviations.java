package lesson_12;
//Написать длинный тест с абриавитуарми на инг
import java.util.Scanner;

public class Abbreviations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        for (String word : words) {
            if (word.length() >= 2 && word.length() <= 6 && word.matches("[A-Z]+")) {
                System.out.println(word);
            }
        }
    }
}
