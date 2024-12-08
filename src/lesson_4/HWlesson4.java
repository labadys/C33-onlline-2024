package lesson_4;

import java.util.Scanner;

public class HWlesson4 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
       // task1();
        task2();
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
    }
}
