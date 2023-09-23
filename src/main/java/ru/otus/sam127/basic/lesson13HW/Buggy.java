package ru.otus.sam127.basic.lesson13HW;

public class Buggy implements Movable {
    private int petrol = 120;
    public boolean move(Landscape lands, int distance, Person prsn){
        if ( prsn.getTransport() != Transportation.BUGGY){
            if (prsn.getTransport() == Transportation.FOOT){
                return prsn.move(lands, distance);
            }
            else{
                System.out.println("Error! " + prsn.getName() + "is now on " + prsn.getTransport().name());
                return false;
            }
        }

        final int petrolPerMeter = 2;

        System.out.println("Person on " + lands.name());

        int petrolMove = distance * petrolPerMeter;

        if (petrolMove > petrol) {
            System.out.println("Petrol not enough");
            return false;
        }

        System.out.println("Distance " + distance + " passed. Petrol " + petrol + " left");
        petrol -= petrolMove;

        return true;
    }
}
