package lesson_8;

class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Тигр рычит: Рррр!");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equalsIgnoreCase(food)) {
            System.out.println("Тигр с удовольствием ест мясо.");
        } else {
            System.out.println("Тигр злится! Он ест только мясо!");
        }
    }
}