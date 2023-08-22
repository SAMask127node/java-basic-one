package ru.otus.sam127.basic.lesson10HW;

import java.util.Objects;

public class Box {
    private String name, color, subject;
    private int length, width,height;
    private boolean isOpen = false;
    private boolean isEmpty = true;

    public Box(String name, int length, int width, int height, String color) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    private void printBoxIsOpen(){
        System.out.println("Коробка открыта: " + isOpen);
    }
    private void printBoxIsEmpty(){
        System.out.println("Коробка пуста: " + isEmpty);
    }

    public void openCloseBox() {
        isOpen = !isOpen;
        printBoxIsOpen();
    }
    public void colorBox(String newColor) {
        color = newColor;
        info();
    }
    public void putIn(String sub) {
        if (!isOpen || !isEmpty)
        {
            printBoxIsOpen();
            return;
        }

        isEmpty = !isEmpty;
        subject = sub;
        System.out.print("Предмет в коробке -> ");
        printBoxIsEmpty();
    }
    public void takeOut() {
        if (!isOpen || isEmpty)
        {
            printBoxIsOpen();
            return;
        }

        isEmpty = !isEmpty;
        System.out.print("Предмет вынут из коробки -> ");
        subject = "";
        printBoxIsEmpty();
    }
    public void info() {
        System.out.println("Текущее состояние коробки " + name + " c размерами(д-ш-в): " + length + "-" + width + "-" + height);
        System.out.println("Цвет коробки: " + color);
        printBoxIsOpen();
        printBoxIsEmpty();
        System.out.println("---------");
    }
}
