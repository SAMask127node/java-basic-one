package ru.otus.sam127.basic.lesson12HW;

public class Plate {
    private int volume,food;

    public Plate(int volume, int food) {
        this.volume = 100;
        this.food = food;
    }
    public void fillFood(int value){
        if(value + food > volume){
            System.out.println("Warning: Объем превышен. Снизьте количество!");
            return;
        }
        food += value;
    }
    public boolean consumeFood(int value){
        if(food - value >= 0){
            System.out.println("Success: Кот покушал");
            return true;
        }
        return false;
    }
}
