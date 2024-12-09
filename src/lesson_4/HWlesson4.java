package lesson_4;

import java.util.Scanner;

public class HWlesson4 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.print("Please enter an integer ");
        int lenght = input.nextInt();

        double[] massiv = new double[lenght];

        for (int index=0; index < massiv.length; index++)
        {
            massiv[index] = Math.random();
        }

        for (int i = 0; i < massiv.length - 1; i++)
        {
            for (int j = 0; j < massiv.length - i - 1; j++)
            {
                if (massiv[j] > massiv[j + 1])
                {
                    double a = massiv[j];
                    massiv[j] = massiv[j + 1];
                    massiv[j + 1] = a;
                }
            }
        }

        System.out.println("ASC");

        for (double a : massiv)
        {
            System.out.println(a);
        }

        for (int i = 0; i < massiv.length - 1; i++)
        {
            for (int j = 0; j < massiv.length - i - 1; j++)
            {
                if (massiv[j] < massiv[j + 1])
                {
                    double a = massiv[j];
                    massiv[j] = massiv[j + 1];
                    massiv[j + 1] = a;
                }
            }
        }

        System.out.println("-----------------\nDESC");

        for (double a : massiv)
        {
            System.out.println(a);
        }
    }

    public static void task2(){
        System.out.print("Please enter an integer ");
        int lenght = input.nextInt();

        double[] massiv = new double[lenght];

        for (int index = 0; index < massiv.length; index++)
        {
            massiv[index] = Math.random();
        }

        for (double a : massiv)
        {
            System.out.println(a);
        }

        double value = massiv[0];

        for (double a : massiv)
        {
         if (value < a)
         {
             value = a;
         }
        }

        System.out.println("Max Value is " + value);

        for (double a : massiv)
        {
            if (value > a)
            {
                value = a;
            }
        }

        System.out.println("Min Value is " + value);

    }

    public static void task3(){
        System.out.print("Please enter an integer ");
        int lenght = input.nextInt();

        double[] massiv = new double[lenght];

        for (int index = 0; index < massiv.length; index++)
        {
            massiv[index] = Math.random();
        }

        for (double a : massiv)
        {
            System.out.println(a);
        }

        int index = 0;

        for (int i = 0; i < massiv.length - 1; i++){
            if (massiv [i] < massiv[index]){
                index = i;
            }
        }

        System.out.println("index of min value " + index );

        for (int i = 0; i < massiv.length - 1; i++){
            if (massiv [i] > massiv[index]){
                index = i;
            }
        }

        System.out.println("---------------\nindex of max value " + index );
    }

    public static void task4() {
        System.out.print("Please enter an integer from 5 to 10 ");
        int lenght = input.nextInt();

        int[] massiv = new int[lenght];

        for (int index = 0; index < massiv.length; index++)
        {
            System.out.print("Please enter an integer ");
            int value = input.nextInt();
            massiv[index] = value;
        }

        int count = 0;

        for (int j : massiv) {
            if (j == 0) {
                count++;
            }
        }

        if(count == 0)
        {
            System.out.println("There is no 0 in the array.");
        }
        else
        {
            System.out.println("There is " + count +  " values with '0' in the array.");
        }
    }

    public static void task5() {
        System.out.print("Please enter an integer ");
        int lenght = input.nextInt();

        double[] massiv = new double[lenght];

        for (int index = 0; index < massiv.length; index++) {
            massiv[index] = Math.random();
        }

        for (double a : massiv)
        {
            System.out.println(a);
        }

        for(int i = 0; i < massiv.length / 2; i++)
        {
            double value = massiv[i];
            massiv[i] = massiv[massiv.length - 1 - i];
            massiv[massiv.length - 1 - i] = value;
        }

        System.out.println("---------------------\n");

        for (double a : massiv)
        {
            System.out.println(a);
        }
    }
    public static void task6() {
        System.out.print("Please enter an integer ");
        int lenght = input.nextInt();

        double[] massiv = new double[lenght];


        for (int index = 0; index < massiv.length; index++)
        {
            System.out.print("Please enter an integer ");
            int value = input.nextInt();
            massiv[index] = value;
        }

        boolean sort = true;

        for (int i = 0; i < massiv.length - 1; i++){
            if (massiv[i] >= massiv[i + 1]){
                sort = false;
                break;
            }
        }

        if (sort){
            System.out.println("The array is sorted by ASC. ");
        }
        else {
            System.out.println("The array is not sorted by ASC. ");
        }
    }
}
