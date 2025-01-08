package lesson_10.Task_2;

public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        User originalUser = new User(1, "Kseniya", new Address("Gomel", "Soshskaya 5th"));

        System.out.println("Введите тип клонирования (1 - поверхностное, 2 - глубокое):");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int cloneType = scanner.nextInt();

        User clonedUser;

        if (cloneType == 1) {
            clonedUser = (User) originalUser.clone();
        } else {
            clonedUser = originalUser.deepClone();
        }

        System.out.println("Оригинальный объект: " + originalUser);
        System.out.println("Клонированный объект: " + clonedUser);

        clonedUser.getAddress().setCity("Los Angeles");

        System.out.println("\nПосле изменения адреса клонированного объекта:");
        System.out.println("Оригинальный объект: " + originalUser);
        System.out.println("Клонированный объект: " + clonedUser);

        scanner.close();
    }
}