package ru.otus.sam127.basic.lesson14HW;

public class AppArrayDataException extends RuntimeException{
    public AppArrayDataException(int a, int b) {
        super("Невернýе данные лежат в строке " + a + ", в столбце " + b);
//        this.rowNumber = a;
//        this.columnNumber = b;
    }
}
