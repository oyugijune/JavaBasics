package Calculator;

class Add {
    public static int add(int a, int b) {
        return a + b;
    }

    static int sum = add(2, 3);
    public static void main(String[]args){
        System.out.println(sum);
    }
}
