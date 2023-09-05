package ru.otus.sam127.basic.lesson12HW;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("cat1", 12),
                new Cat("cat2", 200),
                new Cat("cat2", 6),
                new Cat("cat2", 90),
                new Cat("cat2", 13),
                new Cat("cat2", 20)
        };
        Plate bigPlate = new Plate(100, 97);

        int[] catsFeedValue = {15,20,10, 90,10,25};
        boolean[] catsFullness = new boolean[7];
        for (int i = 0; i < cats.length; i++) {
            catsFullness[i] = cats[i].feed(catsFeedValue[i], bigPlate);
        }
        System.out.println("------Check cats fullness------");
        for (int i = 0; i < cats.length; i++) {
            System.out.println("cat" + i+1 + "'s fullness: " + catsFullness[i]);
        }
    }
}
