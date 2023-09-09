package ru.otus.sam127.basic.lesson13HW;

public class Car implements Movable {
    private int petrol = 120;
    public boolean move(Landscape lands, int distance){
        final int petrolPerMeter = 2;

        System.out.println("Person on " + lands.name());

        int petrolMove = distance * petrolPerMeter;

        if(petrolMove > petrol){
            System.out.println("Petrol not enough");
            return false;
        }

        switch (lands)
        {
            case JUNGLE:
            case SWAMP:
                System.out.println("No Way");
                return false;
            case PLAIN:
                petrol -= petrolMove;
                System.out.println("Distance " + distance + " passed. Petrol " + petrol + " left");
                return true;
        }
        return false;
    }
}
