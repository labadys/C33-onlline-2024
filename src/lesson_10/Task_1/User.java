package lesson_10.Task_1;

import java.util.Objects;

class User {
    private String username;
    private String email;
    private int age;

    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', email='" + email + "', age=" + age + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return age == user.age &&
                Objects.equals(username, user.username) &&
                Objects.equals(email, user.email);
    }
}