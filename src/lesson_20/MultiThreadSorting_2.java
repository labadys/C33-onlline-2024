package lesson_20;

import java.util.Arrays;
import java.util.Random;

public class MultiThreadSorting_2 {
    public static void main(String[] args) {
        int[] array = new Random().ints(10, 1, 100).toArray(); // Генерируем массив из 10 случайных чисел

        System.out.println("Исходный массив: " + Arrays.toString(array));

        int[] array1 = array.clone();
        int[] array2 = array.clone();
        int[] array3 = array.clone();

        Thread insertionSortThread = new Thread(new InsertionSort_2(array1));
        Thread selectionSortThread = new Thread(new SelectionSort_2(array2));
        Thread bubbleSortThread = new Thread(new BubbleSort_2(array3));

        insertionSortThread.start();
        selectionSortThread.start();
        bubbleSortThread.start();

        try {
            insertionSortThread.join();
            selectionSortThread.join();
            bubbleSortThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Сортировка вставками: " + Arrays.toString(array1));
        System.out.println("Сортировка выбором: " + Arrays.toString(array2));
        System.out.println("Сортировка пузырьком: " + Arrays.toString(array3));
    }
}