package ru.otus.sam127.basic.lesson10HW;

public class MainApp {
    public static void main(String[] args) {

        User[] users = {new User("Familiya1", "Imya1", "Otchestvo1", 1980, "user1@gmail.com"),
                new User("Familiya2", "Imya2", "Otchestvo2", 1981, "user2@gmail.com"),
                new User("Familiya3", "Imya3", "Otchestvo3", 1982, "user3@gmail.com"),
                new User("Familiya4", "Imya4", "Otchestvo4", 1983, "user4@gmail.com"),
                new User("Familiya5", "Imya5", "Otchestvo5", 1984, "user5@gmail.com"),
                new User("Familiya6", "Imya6", "Otchestvo6", 1985, "user6@gmail.com"),
                new User("Familiya7", "Imya7", "Otchestvo7", 1986, "user7@gmail.com"),
                new User("Familiya8", "Imya8", "Otchestvo8", 1987, "user8@gmail.com"),
                new User("Familiya9", "Imya9", "Otchestvo9", 1988, "user9@gmail.com"),
                new User("Familiya10", "Imya10", "Otchestvo10", 1978, "user10@gmail.com")};
        for (int i = 0; i < users.length; i++) {
            if ((2023 - users[i].getBirthDate()) > 40) {
                users[i].info();
            }
        }

        Box box1 = new Box("box1",1,2,3,"Красный");
        box1.info();
        box1.putIn();
        box1.openCloseBox();
        box1.putIn();
        box1.putIn();
        box1.openCloseBox();
        box1.takeOut();
        box1.openCloseBox();
        box1.takeOut();
        box1.openCloseBox();
        box1.info();
    }

}
