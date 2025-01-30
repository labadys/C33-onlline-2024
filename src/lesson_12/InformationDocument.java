package lesson_12;
//Мой email: teachmeskills@gmail.com, номер документа: 1234-5678-90, номер телефона: +(12)3456789.
import java.util.Scanner;

public class InformationDocument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String input = scanner.nextLine();

        if (input.contains("@") && input.contains(".")) {
            int startIndex = input.lastIndexOf(" ", input.indexOf("@")) + 1;
            int endIndex = input.indexOf(" ", input.indexOf("@"));
            if (endIndex == -1) {
                endIndex = input.length();
            }
            String email = input.substring(startIndex, endIndex).trim();
            if (email.contains("@") && email.contains(".")) {
                System.out.println("email: " + email);
            }
        }

        String documentRegex = "\\d{4}-\\d{4}-\\d{2}";
        if (input.matches(".*" + documentRegex + ".*")) {
            int startIndex = input.indexOf("1234");
            int endIndex = input.indexOf(" ", startIndex);
            if (endIndex == -1) {
                endIndex = input.length();
            }
            String documentNumber = input.substring(startIndex, endIndex).trim();
            System.out.println("document number: " + documentNumber);
        }

        if (input.contains("+") && input.contains("(")) {
            int startIndex = input.indexOf("+");
            int endIndex = input.indexOf(" ", startIndex);
            if (endIndex == -1) {
                endIndex = input.length();
            }
            System.out.println("phone number: " + input.substring(startIndex, endIndex).trim());
        }
    }
}