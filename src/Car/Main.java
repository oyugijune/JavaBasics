package Car;

public class Main {
    public static void main(String[]args){
        Car car = new Car("mazda","KCA 123K", "white");
        System.out.println(car);

        car.setColor("yellow");
        System.out.println(car);

        car.startCar();
        car.carryGoods();
    }
}
