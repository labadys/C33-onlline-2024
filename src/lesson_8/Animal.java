package lesson_8;

abstract class Animal {
    public abstract void voice();

    public void eat(String food) {
        System.out.println("Животное ест: " + food);
    }
}

