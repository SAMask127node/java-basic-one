package ru.otus.sam127.basic.lesson13HW;

public class MainApp {
    public static void main(String[] args) {

        Car car1 = new Car();
        Horse horse1 = new Horse();
        Buggy buggy1 = new Buggy();
        Bicycle bicycle1 = new Bicycle();

        Person person1 = new Person("name1", car1, horse1, buggy1, bicycle1);

        System.out.println(person1.move(Landscape.PLAIN, 2));
        System.out.println("----------------------------------------------------------");
        person1.getOnTransport(Transportation.CAR);
        System.out.println("----------------------------------------------------------");
        System.out.println(person1.move(Landscape.JUNGLE, 3));
        System.out.println("----------------------------------------------------------");
        System.out.println(person1.move(Landscape.SWAMP, 3));
        System.out.println("----------------------------------------------------------");
        System.out.println(person1.move(Landscape.PLAIN, 3));
        System.out.println("----------------------------------------------------------");
        person1.getOutTransport();
        System.out.println("----------------------------------------------------------");
        System.out.println(person1.move(Landscape.PLAIN, 2));
        System.out.println("----------------------------------------------------------");
        person1.getOnTransport(Transportation.BUGGY);
        System.out.println("----------------------------------------------------------");
        System.out.println(person1.move(Landscape.SWAMP, 2));
        System.out.println("----------------------------------------------------------");
        person1.getOutTransport();
        System.out.println("----------------------------------------------------------");
        person1.getOnTransport(Transportation.HORSE);
        System.out.println("----------------------------------------------------------");
        System.out.println(person1.move(Landscape.PLAIN, 2));
        System.out.println("----------------------------------------------------------");
        person1.getOutTransport();
        System.out.println("----------------------------------------------------------");
        person1.getOnTransport(Transportation.BICYCLE);
        System.out.println("----------------------------------------------------------");
        System.out.println(person1.move(Landscape.PLAIN, 2));
        System.out.println("----------------------------------------------------------");
        person1.getOutTransport();
        System.out.println("----------------------------------------------------------");
        System.out.println(person1.move(Landscape.PLAIN, 2));
        System.out.println("----------------------------------------------------------");
    }
}
