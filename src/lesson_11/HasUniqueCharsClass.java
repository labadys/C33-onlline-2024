package lesson_11;

import java.util.HashSet;

public class HasUniqueCharsClass {
    public static boolean hasUniqueChars(String str) {
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }
}
