package Kilometers;

public class Casting {
    public static void main(String[]args) {
    double a= 10.5;
    int b= 45;
    float c= 5.2F;

    int y= ((int)10.5);
    double z= ((double)45);
    int x= ((int)5.2F);

    System.out.println("The int value of a is: "+ y + "\n The double value of b is: "+ z +
            "\n The int value of float c is: " + x);

    }
}
