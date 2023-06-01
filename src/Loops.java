public class Loops{
    public static void main(String[]args){
        int rows = 5;
        int i = 1;

        while (i <= rows){
            int j= 1;
            while (j <= i){
                System.out.println("#");
                j ++;
            }
            System.out.println();
            i++;

        }

    }

}

//public class Loops {
//    public static void main(String[] args) {
//        System.out.println("""
//                       **** WELCOME TO CREATING PATTERNS USING LOOPS! ****
//                """);
//        int columns = 6;
//        int i = 1;
//        while (i <= columns) {
//            int k = 1;
//            while (k <= i) {
//                System.out.print("* ");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }
//    }
//}



