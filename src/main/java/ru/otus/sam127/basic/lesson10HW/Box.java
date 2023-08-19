package ru.otus.sam127.basic.lesson10HW;

import java.util.Objects;

public class Box {
    private String name;
    private String color;
    private int length;
    private int width;
    private int height;
    private String isOpen = "Нет"; // open = 1; close = 0
    private String isEmpty = "Да"; // empty = 1; full = 0

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
        if (Objects.equals(isOpen, "Да"))
            isOpen = "Нет";
        else
            isOpen = "Да";
        printBoxIsOpen();
    }
    public void openCloseBox(String newColor) {
        color = newColor;
        info();
    }
    public void putIn() {
        if (Objects.equals(isOpen, "Нет"))
        {
            printBoxIsOpen();
            return;
        }
        if (Objects.equals(isEmpty, "Нет"))
        {
            printBoxIsEmpty();
            return;
        }
        isEmpty = "Нет";
        System.out.print("Предмет в коробке -> ");
        printBoxIsEmpty();
    }
    public void takeOut() {
        if (Objects.equals(isOpen, "Нет"))
        {
            printBoxIsOpen();
            return;
        }
        if (Objects.equals(isEmpty, "Дф"))
        {
            printBoxIsEmpty();
            return;
        }
        isEmpty = "Да";
        System.out.print("Предмет вынут из коробки -> ");
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
