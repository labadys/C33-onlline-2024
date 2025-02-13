package lesson_16;

import java.util.HashMap;
import java.util.Map;

public class StringPairs_2 {
    public static Map<String, String> pairs(String[] words) {
        Map<String, String> resultMap = new HashMap<>();

        for (String word : words) {
            String firstChar = String.valueOf(word.charAt(0));
            String lastChar = String.valueOf(word.charAt(word.length() - 1));
            resultMap.put(firstChar, lastChar);
        }

        return resultMap;
    }

    public static void main(String[] args) {
        String[] test1 = {"code", "bug"};
        String[] test2 = {"man", "moon", "main"};
        String[] test3 = {"man", "moon", "good", "night"};

        System.out.println(pairs(test1));
        System.out.println(pairs(test2));
        System.out.println(pairs(test3));
    }
}