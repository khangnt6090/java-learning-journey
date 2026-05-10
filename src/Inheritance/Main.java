package Inheritance;

public class Main {
    public static void main(String[] args){
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Plant plant1 = new Plant();

        dog1.eat();
        cat1.eat();

        System.out.println(dog1.isAlive);
        System.out.println(cat1.isAlive);

        dog1.speak();
        cat1.speak();

        System.out.println(plant1.isAlive);
        plant1.photosynthesis();
    }
}
