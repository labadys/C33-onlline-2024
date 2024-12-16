package lesson_6;

import java.util.Scanner;

public class HWlesson6features {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CreditCard card1 = new CreditCard("1111 2222 3333 4444", 1000);
        CreditCard card2 = new CreditCard("5555 6666 7777 8888", 500);
        CreditCard card3 = new CreditCard("9999 0000 1111 2222", 200);

        System.out.println("Hello im bancomat, please enter the amount to top up the card 1");
        card1.deposit(scanner.nextDouble());
        System.out.println("Please enter the amount to top up the card 2");
        card2.deposit(scanner.nextDouble());
        System.out.println("Please enter the amount to withdraw from the card 3");
        card3.withdraw(scanner.nextDouble());

        card1.printaccountInformation();
        card2.printaccountInformation();
        card3.printaccountInformation();
    }
}
