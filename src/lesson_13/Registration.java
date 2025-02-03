package lesson_13;

import static lesson_13.UserValidator.validateCredentials;

public class Registration {
    public static void main(String[] args) {

        String login = "UserTest ";
        String password = "password1";
        String confirmPassword = "password1";

        boolean result = validateCredentials(login, password, confirmPassword);
        System.out.println("Результат проверки: " + result);
    }
}
