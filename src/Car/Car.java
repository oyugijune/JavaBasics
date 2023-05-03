package Car;

public class Car {
   private String brand ;
   private String numberPlate ;
   private String color ;


   public Car(String brand, String numberPlate, String color){
      this.brand =brand;
      this.numberPlate =numberPlate;
      this.color = color;

   }

   public void startCar(){
      System.out.println("This car is starting");
   }
   public void carryGoods(){
      System.out.println("This car can carry more than 6 tonnes of luggage");
   }

   public String getBrand(){
      return brand;
   }
   public String getNumberPlate(){
      return numberPlate;
   }
   public String getColor(){
      return color;
   }
   public void setBrand(String brand){
      this.brand=brand;
   }
   public void setNumberPlate(String numberPlate){
      this.numberPlate = numberPlate;
   }
   public void setColor(String color){
      this.color =color;
   }



   @Override
   public String toString() {
      return "Car.Car{" +
              "brand='" + brand + '\'' +
              ", numberPlate=" + numberPlate +
              ", color='" + color + '\'' +
              '}';
   }
}
