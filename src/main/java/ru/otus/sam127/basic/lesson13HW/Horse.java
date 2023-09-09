package ru.otus.sam127.basic.lesson13HW;

public class Horse implements Movable {
    private int strength = 1000;

    public boolean move(Landscape lands, int distance){
        final int strengthPerMeter = 1;

        System.out.println("Person on " + lands.toString());

        int strengthMove = distance * strengthPerMeter;

        if(strengthMove > strength){
            System.out.println("Strength not enough");
            return false;
        }

        switch (lands)
        {
            case SWAMP:
                System.out.println("No Way");
                return false;
            case JUNGLE:
            case PLAIN:
                strength -= strengthMove;
                System.out.println("Distance " + distance + " passed. Strength " + strength + " left");
                return true;
        }
        return false;
    }

}
