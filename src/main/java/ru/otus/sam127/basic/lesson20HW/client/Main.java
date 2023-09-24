package ru.otus.sam127.basic.lesson20HW.client;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8088)) {
            PingClient pingClient = new PingClient(socket.getInputStream(), socket.getOutputStream());
            String serverWelcome = pingClient.read();
            System.out.println(serverWelcome);

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            byte[] bytes = (userInput + "\n").getBytes();
            pingClient.write(bytes);

            String result = pingClient.read();
            System.out.println(result);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}