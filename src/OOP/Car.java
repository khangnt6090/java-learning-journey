package OOP;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 5800.99;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("Car is starting...");
    }
    void stop() {
        isRunning = false;
        System.out.println("Car is stopping...");
    }
    void drive(){
        System.out.println("You are driving the car "+ make + " " + model);
    }
    void brake(){
        System.out.println("You are braking the car");
    }
}
