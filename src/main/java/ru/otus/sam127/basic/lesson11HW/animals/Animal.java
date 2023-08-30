package ru.otus.sam127.basic.lesson11HW.animals;

public class Animal {
    String name;
    int speedRun;
    int speedSwim;
    int stamina;
    int staminaPerOneMeterRun = 1;
    int staminaPerOneMeterSwim;

    public Animal(String name, int speedRun, int speedSwim, int stamina, int staminaPerOneMeterSwim) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = stamina;
        this.staminaPerOneMeterSwim = staminaPerOneMeterSwim;
    }

    private void staminaLeft(int distance) {
        int staminaSpent = distance * staminaPerOneMeterRun;
        stamina -= staminaSpent;
    }

    private int exhaustedState() {
        System.out.println("У животного появилось состояние усталости");
        info();
        return -1;
    }

    private void printTimeInfo(int time) {
        System.out.println("Животное бежит " + time + "с");
        info();
    }

    public int run(int distance) {
        stamina -= distance * staminaPerOneMeterRun;
        if (stamina < 0) {
            return exhaustedState();
        }
        int time = distance / speedRun;
        printTimeInfo(time);
        return time;
    }

    public int swim(int distance) {
        stamina -= distance * staminaPerOneMeterSwim;
        if (stamina < 0) {
            return exhaustedState();
        }
        int time = distance / speedSwim;
        printTimeInfo(time);
        return time;
    }

    public void info() {
        System.out.println("Текущее состояние животного " + name + ". Скорость бега: " + speedRun + ". Скорость плавания: " + speedSwim);
        System.out.println("Выносливость " + stamina);
        System.out.println("---------");
    }
}
