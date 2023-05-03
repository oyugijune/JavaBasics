package Calculator;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        logic(true);
    }

    public static void logic(boolean showTitle){

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        double num1 , num2;

        if(showTitle) {
            System.out.println("""
                ============================================================
                =======================CALCULATOR APP=======================
                ============================================================
                """);
        }

        System.out.println("""
                Options
                1. Add
                2. Subtract
                3. Divide
                4. Multiply
                5. Remainder
                6. View History
                7. Clear History
                8. Quit
                Enter your option     
                """);

        int option = scanner.nextInt();
        System.out.print("Enter first digit: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter second digit: ");
        num2 = scanner.nextDouble();

        switch (option){
            case 1 -> {
                String message = histMessage("add", "+", num1, num2, calculator.add(num1, num2));
                calculator.addHistory(message);
                System.out.println(message + "\n");
                logic(false);
            }
            case 2 -> {
                String message = histMessage("Sub", "-", num1, num2, calculator.subtract(num1, num2));
                calculator.addHistory(message);
                System.out.println(message + "\n");
                logic(false);
            }
            case 3 -> {
                String message = histMessage("Divide", "/", num1, num2, calculator.divide(num1, num2));
                calculator.addHistory(message);
                System.out.println(message + "\n");
                logic(false);
            }
            case 4 -> {
                String message = histMessage("Multiply", "*", num1, num2, calculator.multiply(num1, num2));
                calculator.addHistory(message);
                System.out.println(message + "\n");
                logic(false);
            }
            case 5 -> {
                String message = histMessage("Remainder", "%", num1, num2, calculator.remainder(num1, num2));
                calculator.addHistory(message);
                System.out.println(message + "\n");
                logic(false);
            }
            case 6 -> {
                System.out.println("History");
                calculator.getHistory().forEach(System.out::println);
                logic(false);
            }
            case 7 -> {
                calculator.clearHistory();
                System.out.println("Cleared history");
                logic(false);
            }
            case 8 -> {
                System.out.println("Bye!");
                System.exit(1);
            }
            default -> {
                System.out.println("Invalid option");
                logic(false);
            }

        }

    }

    public static String histMessage(String operator, String symbol, double num1, double num2, double result){
        return String.format("%s: %.1f %s %.1f = %.1f", operator, num1, symbol, num2, result);
    }
}
