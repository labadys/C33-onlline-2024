package lesson_8;

class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Собака говорит: Гав-гав!");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equalsIgnoreCase(food)) {
            System.out.println("Собака любит мясо и ест с удовольствием.");
        } else {
            System.out.println("Собака недовольна, она хочет мясо!");
        }
    }
}