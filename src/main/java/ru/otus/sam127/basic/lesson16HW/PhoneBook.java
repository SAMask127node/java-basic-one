package ru.otus.sam127.basic.lesson16HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final HashMap<String,String> book = new HashMap<>();


    public void add(String name, String phoneNumber){
        book.put(phoneNumber, name);
    }
    public ArrayList<String> find(String nameToFind){
        ArrayList<String> numbers = new ArrayList<>();
        if (book.containsValue(nameToFind)){
            for (Map.Entry<String,String> s : book.entrySet()){
                if (s.getValue().equals(nameToFind)){
                    numbers.add(s.getKey());
                }
            }
        }
        return numbers;
    }

    public boolean containsPhoneNumber(String phoneNumberToFind){
               return book.containsKey(phoneNumberToFind);
    }
}
