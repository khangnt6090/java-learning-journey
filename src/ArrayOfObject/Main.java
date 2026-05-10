package ArrayOfObject;

public class Main {
    public static void main(String[] args){
//        Car car1 = new Car("BMW", "Red");
//        Car car2 = new Car("Mustang", "Black");
//        Car car3 = new Car("Ferrari", "Red");

        Car[] cars = {new Car("BMW", "Red"), new Car("Mustang", "Black"), new Car("Ferrari", "Red")};

//        for (int i = 0; i < cars.length; i++) {
//            cars[i].drive();
//        }
        for (Car car : cars) {
            car.drive();
        }
    }
}
