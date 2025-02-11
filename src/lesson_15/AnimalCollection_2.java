package lesson_15;

import java.util.LinkedList;

public class AnimalCollection_2 {
    private LinkedList<String> animals = new LinkedList<>(); // Используем LinkedList

    public void addAnimal(String animal) {
        animals.addFirst(animal);
        System.out.println(animal + " добавлен в коллекцию.");
    }

    public void removeAnimal() {
        if (!animals.isEmpty()) {
            String removedAnimal = animals.removeLast();
            System.out.println(removedAnimal + " удалён из коллекции.");
        } else {
            System.out.println("Коллекция пуста, удалять нечего.");
        }
    }

    public void showAnimals() {
        System.out.println("Текущая коллекция животных: " + animals);
    }
}