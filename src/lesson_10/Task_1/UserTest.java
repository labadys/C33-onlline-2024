package lesson_10.Task_1;

public class UserTest {
    public static void main(String[] args) {

        User user1 = new User("Polyak", "Polyak@gmail.com", 28);
        User user2 = new User("Polyak", "Polyak@gmail.com", 28);
        User user3 = new User("Bob", "bob@gmail.com", 26);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        System.out.println("user1 equals user2: " + user1.equals(user2)); // true
        System.out.println("user1 equals user3: " + user1.equals(user3)); // false

        System.out.println("user1 hashCode: " + user1.hashCode());
        System.out.println("user2 hashCode: " + user2.hashCode());
        System.out.println("user3 hashCode: " + user3.hashCode());
    }
}