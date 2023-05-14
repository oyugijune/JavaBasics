package Car;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        double weight= input.nextDouble();
        System.out.println("Enter your height in inches: ");
        double height= input.nextDouble();

        final double KILOGRAM_PER_POUND = 0.45359237;
        final double METER_INCH = 0.0254;
        double newWeight= weight * KILOGRAM_PER_POUND;
        double newHeight= height * METER_INCH;
        double bmi= newWeight/(newHeight*newHeight);


        System.out.println("Weight in kg is" + " "+ newWeight+ ":" );
        System.out.println("Height in meters is"+ " " + newHeight+ ":");
        System.out.println("BMI is"+" "+ bmi);
        if (bmi<=18.5)
            System.out.println("Underweight");
         else if(bmi<=25)
             System.out.println("Normal");
         else if(bmi<=30)
             System.out.println("Overweight");
         else if (bmi>=30)
             System.out.println("Obese");

    }
}
