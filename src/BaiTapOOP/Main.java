package BaiTapOOP;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Muc";

        System.out.println("Ten: " + dog1.name);

        dog1.eat();
        dog1.bark();
    }
}