package Lottery;

import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        System.out.println("""
                ********* WELCOME TO COMPUTING ANGLES OF A TRIANGLE! *********
                """);
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a: ");
       int a = scanner.nextInt();
       System.out.println("Enter value of b: ");
        int b = scanner.nextInt();
        System.out.println("Enter value of c: ");
      int c = scanner.nextInt();

        double angleA = Math.acos((a * a) - (b * b) - (c * c)) / (-2 * a * c);
       double angleB = Math.acos((b * b) - (a * a) - (c * c)) / (-2 * a * b);
       double angleC = Math.acos((c * c) - (a * a) - (b * b)) / (-2 * a * b);
      System.out.println(angleA);
        System.out.println(a);
      System.out.println(Math.acos(-100));
        System.out.println("<A is " + angleA + "\n<B is " + angleB + "\n<C is " + angleC);
        
    }
}
