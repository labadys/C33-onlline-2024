package lesson_7;

class Surgeon extends Doctor {
    @Override
    public void treat() {
        System.out.println("Хирург проводит операцию.");
    }
}
