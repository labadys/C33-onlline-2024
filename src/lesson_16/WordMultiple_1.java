package lesson_16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordMultiple_1 {
    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> countMap = new HashMap<>();
        Map<String, Boolean> resultMap = new HashMap<>();

        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }
        
        for (String word : countMap.keySet()) {
            resultMap.put(word, countMap.get(word) >= 2);
        }

        return resultMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите буквы через пробел:");
        String input = scanner.nextLine().trim();

        String[] words = input.split("\\s+");

        Map<String, Boolean> result = wordMultiple(words);
        System.out.println("Результат:" + result);
    }
}