package ru.otus.sam127.basic.lesson14HW;

public class AppArraySizeException extends RuntimeException {
//    private int rowNumber, columnNumber;

    public AppArraySizeException() {
        super("Массив другого размера. Массив должен быть размером 4х4.");
    }


}
