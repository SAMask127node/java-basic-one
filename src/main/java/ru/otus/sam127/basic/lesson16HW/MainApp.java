package ru.otus.sam127.basic.lesson16HW;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("A","11");
        phoneBook.add("B","12");
        phoneBook.add("C","13");
        phoneBook.add("D","14");
        phoneBook.add("E","15");
        phoneBook.add("A","16");

        ArrayList<String> nums;
        nums = phoneBook.find("A");
        System.out.println(nums);

        boolean isPhoneNumberInBook;
        isPhoneNumberInBook = phoneBook.containsPhoneNumber("15");
        System.out.println(isPhoneNumberInBook);

    }
}
