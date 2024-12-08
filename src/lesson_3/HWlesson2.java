package lesson_3;

import java.util.Scanner;

public class HWlesson2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.print("Please enter an integer ");
        int b = input.nextInt();

        System.out.print("Please enter an integer ");
        int c = input.nextInt();

        int a = 4*(b+c-1)/2;

        System.out.print("Your result is " + a);
    }

    public static void task2(){
        System.out.print("\nPlease enter a two-digit number ");
        int a = input.nextInt();

        int firstSymbol = a%10;
        int secondSymbol = a/10;
        int result = firstSymbol + secondSymbol;

        System.out.print("Sum is = " + result);
    }

    public static void task3(){
        System.out.print("\nPlease enter a three dijit number ");
        int a = input.nextInt();

        int firstSymbol = a/100;
        System.out.print(firstSymbol);

        int secondSymbol = (a%100/10) % 10;
        int thirdSymbol = a%10;
        int result = firstSymbol + secondSymbol + thirdSymbol;

        System.out.print("Sum is = " + result);
    }

    public static void task4(){
        System.out.print("\nPlease enter a fractional number ");
        double value = input.nextDouble();

        int integer = (int) value;
        double remainingValue = value - integer;
        int result;

        if (remainingValue >= 0.5)
        {
            result = integer + 1;
        }
        else
        {
            result = integer;
        }

        System.out.print("Result is = " + result);
    }

    public static void task5(){
        System.out.print("\nPlease enter first integer ");
        int firstNumber = input.nextInt();

        System.out.print("Please enter second integer ");
        int secondNumber = input.nextInt();

        int integer = firstNumber / secondNumber;
        int remainingNumber = firstNumber % secondNumber;

        System.out.print(firstNumber + " / " + secondNumber + " = " + integer + " and remains = " + remainingNumber);
    }
}

