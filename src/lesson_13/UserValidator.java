package lesson_13;

public class UserValidator {

    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String RED = "\u001B[31m";

    public static boolean validateCredentials(String login, String password, String confirmPassword) {
        try {

            if (login.length() >= 20) {
                throw new WrongLoginException("Ошибка: логин должен быть меньше 20 символов.");
            }

            if (login.contains(" ")) {
                throw new WrongLoginException("Ошибка: логин не должен содержать пробелы.");
            }

            if (password.length() >= 20) {
                throw new WrongPasswordException("Ошибка: пароль должен быть меньше 20 символов.");
            }

            if (password.contains(" ")) {
                throw new WrongPasswordException("Ошибка: пароль не должен содержать пробелы.");
            }

            boolean hasDigit = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                    break;
                }
            }

            if (!hasDigit) {
                throw new WrongPasswordException("Ошибка: пароль должен содержать хотя бы одну цифру.");
            }

            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Ошибка: пароли не совпадают.");
            }

            System.out.println(GREEN + "Проверка пройдена." + RESET);
            return true;

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(RED + e.getMessage() + RESET);
            return false;
        }
        finally {
            System.out.println("test");
        }
    }
}
