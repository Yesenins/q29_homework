package Lesson9;

import Lesson9.domain.User;
import Lesson9.service.impl.GameHandlerImpl;
import Lesson9.service.impl.GameServiceImpl;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter your account balance: ");
        int balance = scan.nextInt();

        User user = new User(name, balance);
        GameHandlerImpl gameHandler = new GameHandlerImpl(new GameServiceImpl());

        gameHandler.runGame(user);

    }
}
