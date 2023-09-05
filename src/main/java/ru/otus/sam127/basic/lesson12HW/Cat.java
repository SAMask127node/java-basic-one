package ru.otus.sam127.basic.lesson12HW;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness = false;
    private Plate catsPlate;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean feed(int value, Plate plate){
        if (value>appetite && plate.consumeFood(value))
            fullness = true;
        return fullness;
    }
}
