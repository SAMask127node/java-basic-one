package ru.otus.sam127.basic.lesson11HW.animals;

public class Cat extends Animal {
    public Cat(String name, int  speedRun, int speedSwim, int stamina) {
        super(name, speedRun,0, stamina,stamina + 1);
    }
}
