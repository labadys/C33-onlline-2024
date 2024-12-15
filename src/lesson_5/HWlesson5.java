package lesson_5;

import java.util.Random;
import java.util.Scanner;

public class HWlesson5 {

    public static void main(String[] args) {
        task1_1();
        task1_2();
        task1_3();
        task2();
    }

    public static void task1_1 () {
        int[][] array = new int[3][3];

        Random random = new Random();

        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                array[a][b] = random.nextInt(10);
            }
        }

        for (int[] a : array) {
            for (int b : a) {
                System.out.println(b + " ");
            }
        }
    }

    public static void task1_2() {
        int[][] array = new int[3][3];

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                array[a][b] = random.nextInt(500);
            }
        }

        System.out.println("The initial array ");

        for (int[] a : array) {
            for (int b : a) {
                System.out.println(b + " ");
            }
            System.out.println();
        }

        System.out.print("Please enter an integer which should be added to the element ");
        int number = scanner.nextInt();

        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                array[a][b] += number;
            }
        }

        System.out.println("----------------------------\nArray after changing the number ");

        for (int[] a : array) {
            for (int b : a) {
                System.out.println(b + " ");
            }
            System.out.println();
        }
    }

    public static void task1_3() {
        int[][] array = new int[3][3];

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                array[a][b] = random.nextInt(814);
            }
        }

        System.out.println("The initial array ");

        for (int[] a : array) {
            for (int b : a) {
                System.out.println(b + " ");
            }
            System.out.println();
        }

        System.out.print("Please enter an integer which should be added to the element ");
        int number = scanner.nextInt();

        int sum = 0;

        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                array[a][b] += number;
                sum += array[a][b];
            }
        }

        for (int a = 0; a < array.length; a++) {
            for (int b = 0; b < array[a].length; b++) {
                array[a][b] += number;
            }
        }

        System.out.println("----------------------------\nArray after changing the number ");

        for (int[] a : array) {
            for (int b : a) {
                System.out.println(b + " ");
            }
            System.out.println();
        }

        System.out.print("The sum of the values of the entire array " + sum);
    }

    public static void task2() {
        String[][] board = new String[8][8];

        for (int a = 0; a < board.length; a++) {
            for (int b = 0; b < board[a].length; b++) {
                if ((a + b) % 2 == 0) {
                    board[a][b] = "W";
                } else {
                    board[a][b] = "B";
                }
            }
        }

        for (String[] a : board) {
            for (String b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}



