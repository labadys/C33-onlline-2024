package lesson_8;

class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Кролик пищит: Пи пи!");
    }

    @Override
    public void eat(String food) {
        if ("Grass".equalsIgnoreCase(food)) {
            System.out.println("Кролик ест травку и счастлив.");
        } else {
            System.out.println("Кролик недоволен, он хочет только травку!");
        }
    }
}
