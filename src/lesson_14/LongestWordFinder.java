package lesson_14;

import java.io.*;
import java.util.Scanner;

public class LongestWordFinder {
    private static final String RED = "\u001B[31m";
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\Slava\\IdeaProjects\\C33-onlline-2024\\src\\lesson_14\\romeo_and_juliet.txt";
        String outputFileName = "C:\\Users\\Slava\\IdeaProjects\\C33-onlline-2024\\src\\lesson_14\\longest_word.txt";
        String longestWord = "";

        try (Scanner scanner = new Scanner(new File("C:\\Users\\Slava\\IdeaProjects\\C33-onlline-2024\\src\\lesson_14\\romeo_and_juliet.txt"))) {
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("[^a-zA-Z]", "");
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден. Убедись, что файл '" + inputFileName + "' существует.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            writer.write("Самое длинное слово: " + longestWord);
            System.out.println("Самое длинное слово записано в файл '" + outputFileName + "'." + " \n" + "Самым длинным словом является: "+" \u001B[31m" + longestWord );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}