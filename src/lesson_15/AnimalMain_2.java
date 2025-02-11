package lesson_15;

public class AnimalMain_2 {
    public static void main(String[] args) {
        AnimalCollection_2 animalCollection = new AnimalCollection_2();

        animalCollection.addAnimal("Кот");
        animalCollection.addAnimal("Собака");
        animalCollection.addAnimal("Тигр");

        animalCollection.showAnimals();

        animalCollection.removeAnimal();
        animalCollection.removeAnimal();

        animalCollection.showAnimals();
    }
}