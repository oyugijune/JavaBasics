package Kilometers;
import java.util.Scanner;
public class Time {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter value for seconds: ");
        double seconds= input.nextDouble();

        double minutes= seconds/60;
        double remainingSeconds= seconds%60;

        System.out.println("The total time is"+ minutes+ "minutes"+ seconds+ "seconds and "+ remainingSeconds+
                "remaining seconds");

    }


}
