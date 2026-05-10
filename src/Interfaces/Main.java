package Interfaces;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hakw hakw = new Hakw();
        Fish fish = new Fish();

        rabbit.flee();
        hakw.hunt();
        fish.flee();
        fish.hunt();
    }
}
