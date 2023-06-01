import java.util.Scanner;
public class FormatSpecifiers {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s \n", "#", "Name", "Age", "Gender");
        System.out.println("-".repeat(40));
        System.out.printf("%-10d%-10s%-10d%-10s \n", 1, "Albert", 22, "Male");
        System.out.printf("%-10d%-10s%-10d%-10s \n", 2, "John", 16, "Male");
        System.out.printf("%-10d%-10s%-10d%-10s \n", 3, "Emma", 19, "Female");
    }
}
//    int random1 = ((int)Math.random() * 5);
//    int random2 = ((int)Math.random() * 5);
//
//    Scanner input = new Scanner(System.in);
//    System.out.print("What is " + random1 + "+" + random2 + "? : ");
//    int Answer = input.nextInt();
//
//    while(random1 + random2!=Answer){
//        System.out.println("Wrong answer! Please try again! What is " + random1 + "+" + random2 + "? : ");
//        int answer = input.nextInt();
//    }
//    System.out.println("Congratulations! you got the right answer!");
//
//    }
//}
