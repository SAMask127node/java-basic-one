package ru.otus.sam127.basic.lesson11HW;


import ru.otus.sam127.basic.lesson11HW.animals.Cat;
import ru.otus.sam127.basic.lesson11HW.animals.Dog;
import ru.otus.sam127.basic.lesson11HW.animals.Horse;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 3, 3, 20);
        cat.info();
        cat.run(10);
        cat.swim(2);

        System.out.println("********DOG**********");
        Dog dog = new Dog("Barsik", 3, 3, 20);
        dog.info();
        dog.run(10);
        dog.swim(2);
        dog.swim(2);

        System.out.println("********HORSE**********");
        Horse horse = new Horse("Barsik", 3, 3, 20);
        horse.info();
        horse.run(10);
        horse.swim(2);
        horse.swim(2);
    }
}
