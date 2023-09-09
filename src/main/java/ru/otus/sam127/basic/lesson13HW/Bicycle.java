package ru.otus.sam127.basic.lesson13HW;

public class Bicycle {
    public int move(Landscape lands, int distance, int personStrength){
        final int strengthPerMeter = 1;

        System.out.println("Person on " + lands.name());

        int strengthMove = distance * strengthPerMeter;

        if(strengthMove > personStrength){
            System.out.println("Strength not enough");
            return 0;
        }

        switch (lands)
        {
            case SWAMP:
                System.out.println("No Way");
                return 0;
            case JUNGLE:
            case PLAIN:
                personStrength -= strengthMove;
                System.out.println("Distance " + distance + " passed. Strength " + personStrength + " left");
                return personStrength;
        }
        return 0;
    }

}
