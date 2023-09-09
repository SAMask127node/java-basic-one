package ru.otus.sam127.basic.lesson13HW;

public class Person {
    final private String name;
    private int strength = 150;
    final private Car car1;
    final private Horse horse1;
    final private Buggy buggy1;
    final private Bicycle bicycle1;
    private Transportation currentTransport = Transportation.FOOT;

    public Person(String name, Car car, Horse horse, Buggy buggy, Bicycle bicycle) {
        this.name = name;
        this.car1 = car;
        this.horse1 = horse;
        this.buggy1 = buggy;
        this.bicycle1 = bicycle;
    }

    public void getOnTransport(Transportation transport) {
        System.out.println(name + " get on " + transport.name());
        currentTransport = transport;
    }

    public void getOutTransport() {
        System.out.println(name + " get out " + currentTransport.name());
        currentTransport = Transportation.FOOT;
    }

    public boolean move(Landscape lands, int distance) {
        final int strengthPerMeter = 10;

        System.out.println("Person move on " + lands.name() + " at distance " + distance + " by " + currentTransport.name());
        if (currentTransport == Transportation.FOOT) {
            int moveStrength = distance * strengthPerMeter;
            if (moveStrength >= strength) {
                System.out.println("Strength not enough");
                return false;
            }
            strength -= moveStrength;
            System.out.println("Distance " + distance + " passed. Strength " + strength + " left");
            return true;
        } else {
            switch (currentTransport) {
                case HORSE:
                    System.out.println("Лошадь");
                    return horse1.move(lands, distance);
                case BICYCLE:
                    System.out.println("Велосипед");
                    int strengthLeft = bicycle1.move(lands, distance, strength);
                    if (strengthLeft != 0) {
                        strength = strengthLeft;
                        return true;
                    }
                    return false;
                case BUGGY:
                    System.out.println("Внедорожник");
                    return buggy1.move(lands, distance);
                case CAR:
                    System.out.println("Машина");
                    return car1.move(lands, distance);
            }
        }

        return false;
    }
}

 /*switch (transport) {
            case HORSE:
                System.out.println("Лошадь");
                break;
            case BICYCLE:
                System.out.println(Велосипед);
                break;
            case BUGGY:
                System.out.println("Внедорожник");
                break;
            case CAR:
                System.out.println("Машина");
                break;
        }*/