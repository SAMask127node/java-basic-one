package ru.otus.sam127.basic.lesson18HW;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {
        String relativePath = "src/main/java/ru/otus/sam127/basic/files";
        File file = new File(relativePath);
        System.out.println(Arrays.stream(file.listFiles()).map(m->m.getName()).collect(Collectors.toList()));
        System.out.println("Enter name of file");
        Scanner inConsole = new Scanner(System.in);
        String s = inConsole.nextLine();

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(relativePath+"/"+s))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char)n);
                n = in.read();
            }
            System.out.print("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Enter anything");
        String s2 = inConsole.nextLine();
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(relativePath+"/"+s))) {
            byte[] buffer = s2.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
