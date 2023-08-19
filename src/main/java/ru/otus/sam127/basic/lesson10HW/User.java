package ru.otus.sam127.basic.lesson10HW;

public class User {
    private String surname;
    private String name;
    private String middleName;
    private String email;
    private int birthDate;

    public User(String surname, String name, String middleName, int birthDate, String email) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.email = email;
    }

    public void info() {
        System.out.println(this.surname + " " + this.name + " " + this.middleName);
        System.out.println(this.birthDate);
        System.out.println(this.email);
        System.out.println("-----------");
    }

    public int getBirthDate() {
        return birthDate;
    }
}
