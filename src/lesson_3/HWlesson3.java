package lesson_3;

import java.util.Scanner;

public class HWlesson3 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

      public static void task1(){
        System.out.print("Please enter an integer ");
        int a = input.nextInt();

        int remainingNumber = a%2;

        if (remainingNumber == 0)
        {
            System.out.print("This is an even number ");
        }
        else
        {
            System.out.print("This is an odd number ");
        }
      }

      public static void task2(){
        System.out.print("Please enter temp");
        int temp = input.nextInt();

        if (temp > -5)
        {
            System.out.print("Warm");
        }
        else if (temp > -20)
        {
            System.out.print("Normal");
        }
        else
          {
              System.out.print("Cold");
          }

      }

      public static void task3(){
        for (int a = 10; a <= 20; a++)
            System.out.println(a * a); //
      }

      public static void task4(){
        int a = 7;

        while (a <= 98)
        {
            System.out.println(a);
            a = a+7;
        }
      }
}