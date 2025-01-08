package lesson_8;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal rabbit = new Rabbit();

        Animal[] animals = {dog, tiger, rabbit};

        System.out.println("Добро пожаловать в зоопарк! Здесь есть собака, тигр и кролик.");

        for (Animal animal : animals) {
            System.out.println("Как вы думаете, как звучит это животное ?" + animal);
            scanner.nextLine();
            animal.voice();

            System.out.println("Чем вы хотите покормить это животное?");
            String food = scanner.nextLine();
            animal.eat(food);

            System.out.println();
        }

        System.out.println("Спасибо за посещение зоопарка!");
        scanner.close();
    }
}
