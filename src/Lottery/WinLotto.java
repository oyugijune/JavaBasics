package Lottery;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WinLotto {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE LONG AWAITED LOTTO.\n THIS IS WHERE YOU BECOME A MILLIONAIRE BY LUCK.\n" +
                "SUCCESS TO ALL PLAYERS! ");
        int lotDigit = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
           System.out.print("Enter your lucky two digit number: ");
           int luckyDigits = 0;
          try{ luckyDigits = scanner.nextInt();
          }catch ( InputMismatchException e){
          System.out.println("enter a digit...Try again");
          return;
       }


        int getLuckyDigit1 = luckyDigits / 10;
        int getLuckyDigit2 = luckyDigits % 10;

        int getLotDigit1 = lotDigit / 10;
        int getLotDigit2 = lotDigit % 10;
        System.out.println("The lottery number is: " + lotDigit);
        if (luckyDigits == lotDigit)
            System.out.println("You have won ksh 1000000 ");

        else if (getLuckyDigit1 == getLotDigit2 && getLuckyDigit2 == getLotDigit1)
            System.out.println("You have won ksh 500000 ");

        else
        System.out.println("Digits mismatch! You have lost.");


    }
}
