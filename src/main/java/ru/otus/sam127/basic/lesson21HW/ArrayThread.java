package ru.otus.sam127.basic.lesson21HW;

public class ArrayThread implements Runnable{
    private double[] myArr;
    private int initialValue;
    public ArrayThread(double[] arr, int initValue) {
        this.myArr= arr;
        this.initialValue = initValue;
    }

    @Override
    public void run() {
        for (int i = initialValue; i < this.myArr.length; i++) {
            myArr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
