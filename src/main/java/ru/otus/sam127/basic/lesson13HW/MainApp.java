package ru.otus.sam127.basic.lesson13HW;

public class MainApp {
    public static void main(String[] args) {
        Car car1 = new Car();
        Horse horse1 = new Horse();
        Buggy buggy1 = new Buggy();
        Bicycle bicycle1 = new Bicycle();

        Person person1 = new Person("name1");

        System.out.println(person1.move(Landscape.PLAIN, 2));
        System.out.println("----------------------------------------------------------");
        person1.setTransport(Transportation.CAR);
        System.out.println("----------------------------------------------------------");
        System.out.println(car1.move(Landscape.JUNGLE, 3,person1));
        System.out.println("----------------------------------------------------------");
        System.out.println(car1.move(Landscape.SWAMP, 3,person1));
        System.out.println("----------------------------------------------------------");
        System.out.println(car1.move(Landscape.PLAIN, 3,person1));
        System.out.println("----------------------------------------------------------");
        person1.setTransportFoot();
        System.out.println("----------------------------------------------------------");
        System.out.println(person1.move(Landscape.PLAIN, 2));
        System.out.println("----------------------------------------------------------");
        person1.setTransport(Transportation.BUGGY);
        System.out.println("----------------------------------------------------------");
        System.out.println(buggy1.move(Landscape.SWAMP, 2,person1));
        System.out.println("----------------------------------------------------------");
        person1.setTransportFoot();
        System.out.println("----------------------------------------------------------");
        person1.setTransport(Transportation.HORSE);
        System.out.println("----------------------------------------------------------");
        System.out.println(horse1.move(Landscape.PLAIN, 2,person1));
        System.out.println("----------------------------------------------------------");
        person1.setTransportFoot();
        System.out.println("----------------------------------------------------------");
        person1.setTransport(Transportation.BICYCLE);
        System.out.println("----------------------------------------------------------");
        System.out.println(bicycle1.move(Landscape.PLAIN, 2,person1));
        System.out.println("----------------------------------------------------------");
        person1.setTransportFoot();
        System.out.println("----------------------------------------------------------");
        System.out.println(person1.move(Landscape.PLAIN, 2));
        System.out.println("----------------------------------------------------------");
    }
}

