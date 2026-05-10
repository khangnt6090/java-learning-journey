package toStringMethod;

public class Car {
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    @Override
    public String toString(){
        return "Car: " + this.make + " " + this.model + " " + this.year + " " + this.color;
    }
}
