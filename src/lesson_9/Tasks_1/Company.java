package lesson_9.Tasks_1;

public class Company {
    public static void main(String[] args) {

        JobTitle director = new Director();
        JobTitle worker = new Worker();
        JobTitle accountant = new Accountant();

        director.printJobTitle();
        worker.printJobTitle();
        accountant.printJobTitle();
    }
}
