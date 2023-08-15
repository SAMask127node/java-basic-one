package ru.otus.sam127.basic.lesson3HW;

public class MainApp {
    public static void main(String[] args) {
        greetings();
        checkSign(2,3,4);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(5,2,false);
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }
    public static void checkSign(int a, int b, int c) {
        int sum = a+b+c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }
    public static void selectColor() {
        int data = 25;
        if (data <= 10) {
            System.out.println("Красный");
        }
        else if(data <= 20){
            System.out.println("Желтый");
        }
        else{
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 15;
        int b = 25;

        if (a >= b) {
            System.out.println("a >= b");
        }
        else{
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue+delta);
        }
        else{
            System.out.println(initValue-delta);
        }
    }
}
