package lesson_20;

import java.util.Scanner;

public class MinMaxThreads_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        MaxFinder_1 maxFinder = new MaxFinder_1(array);
        MinFinder_1 minFinder = new MinFinder_1(array);

        maxFinder.start();
        minFinder.start();

        try {
            maxFinder.join();
            minFinder.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Максимум: " + maxFinder.getMax());
        System.out.println("Минимум: " + minFinder.getMin());
    }
}