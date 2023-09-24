package ru.otus.sam127.basic.lesson20HW.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8088);
        byte[] bytes = "Сервер выполняет математические вычисления: +,-,*,/\n".getBytes();

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            PingServer pingServer = new PingServer(socket.getInputStream(), socket.getOutputStream());
            pingServer.write(bytes);

            String clientWords = pingServer.read();
            String[] clientWordsArr = clientWords.split(" ");
            int firstTerm = Integer.parseInt(clientWordsArr[0].trim());
            int secondTerm = Integer.parseInt(clientWordsArr[1].trim());
            String mathOperator = clientWordsArr[2];
            String result;
            switch (mathOperator) {
                case "+":
                    result = Integer.toString(firstTerm + secondTerm);
                    break;
                case "-":
                    result = Integer.toString(firstTerm - secondTerm);
                    break;
                case "*":
                    result = Integer.toString(firstTerm * secondTerm);
                    break;
                case "/":
                    result = Double.toString(firstTerm*1.0 / secondTerm);
                    break;
                default:
                    result = "Could not read operator";
            }
            pingServer.write((result+"\n").getBytes());
        }
    }
}
