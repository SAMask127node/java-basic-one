package ru.otus.sam127.basic.lesson13HW;

public class Bicycle implements Movable {
    //    public int move(Landscape lands, int distance, int personStrength){
    public boolean move(Landscape lands, int distance, Person prsn) {
        if (prsn.getTransport() != Transportation.BICYCLE) {
            if (prsn.getTransport() == Transportation.FOOT) {
                return prsn.move(lands, distance);
            } else {
                System.out.println("Error! " + prsn.getName() + "is now on " + prsn.getTransport().name());
                return false;
            }
        }

        final int strengthPerMeter = 1;

        System.out.println("Person on " + lands.name());

        int strengthMove = distance * strengthPerMeter;
        int personStrength = prsn.getStrength();
        if (strengthMove > personStrength) {
            System.out.println("Strength not enough");
            return false;
        }

        switch (lands) {
            case SWAMP:
                System.out.println("No Way");
                return false;
            case JUNGLE:
            case PLAIN:
                personStrength -= strengthMove;
                System.out.println("Distance " + distance + " passed. Strength " + personStrength + " left");
                prsn.setStrength(personStrength);
                return true;
            default: return false;
        }
    }

}
