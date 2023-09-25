package ru.otus.sam127.basic.lesson21HW;

public class MainApp {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        createArray();
        System.out.println(System.currentTimeMillis()-t);

        long t1 = System.currentTimeMillis();
        createArrayThreads();
        System.out.println(System.currentTimeMillis()-t1);
    }

    public static void createArray(){
        double[] arr = new double[100_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
    public static void createArrayThreads(){
        double[] arr = new double[100_000_000];

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < arr.length/4; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = arr.length/4; i < arr.length*2/4; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = arr.length*2/4; i < arr.length*3/4; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = arr.length*3/4; i < arr.length; i++) {
                arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
