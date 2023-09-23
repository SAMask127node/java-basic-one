package ru.otus.sam127.basic.lesson13HW;

public class Person {
    final private String name;
    private int strength = 150;
    private Transportation currentTransport = Transportation.FOOT;

    public Person(String name) {
        this.name = name;
    }

    public void setTransport(Transportation transport) {
        System.out.println(name + " get on " + transport.name());
        currentTransport = transport;
    }

    public void setTransportFoot() {
        System.out.println(name + " get out " + currentTransport.name());
        currentTransport = Transportation.FOOT;
    }
    public Transportation getTransport() {
        System.out.println(name + " now on " + currentTransport.name());
        return currentTransport;
    }
    public String getName() {
        return name;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strngth) {
        strength = strngth;
    }

    public boolean move(Landscape lands, int distance) {
        final int strengthPerMeter = 10;

        System.out.println("Person move on " + lands.name() + " at distance " + distance + " by " + currentTransport.name());
        if (currentTransport != Transportation.FOOT) {
            System.out.println("Error! " + name + "is now on " + currentTransport.name());
            return false;
        }

        int moveStrength = distance * strengthPerMeter;
        if (moveStrength >= strength) {
            System.out.println("Strength not enough");
            return false;
        }
        strength -= moveStrength;
        System.out.println("Distance " + distance + " passed. Strength " + strength + " left");
        return true;
    }
}
