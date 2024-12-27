package Lesson9.service.impl;

import Lesson9.domain.User;
import Lesson9.exeption.BasicValidationExeption;
import Lesson9.service.GameHandler;
import Lesson9.service.GameService;

import java.util.Scanner;

public class GameHandlerImpl implements GameHandler {

    private final GameService gameService;

    Scanner scan = new Scanner(System.in);

    public GameHandlerImpl(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void runGame(User user) {

        while(user.getBalance() > 0){
            try {
                System.out.println("Place your bet");
                int bet = scan.nextInt();
                gameService.validateBet(user,bet);

                int number = inputNumber();

                if(number == -1){
                    System.out.println("Game over");
                    break;
                }
                boolean gameResult = gameService.play(number);
                gameService.changeBalance(user,bet,gameResult);

            }
            catch (BasicValidationExeption basicValidationExeption){
                System.out.println(basicValidationExeption.getMessage());
            }

        }
        if(user.getBalance() <= 0){
            System.out.println("Game over, your balance is 0");
        }
    }

    public int inputNumber(){

        System.out.println("Enter a number between 0 and 5, enter -1 to exit");
        int number = scan.nextInt();

        try{
            gameService.validateNumber(number);
        }
        catch (BasicValidationExeption basicValidationExeption) {
            System.out.println(basicValidationExeption.getMessage());
            return inputNumber();
        }
        return number;
    }



}
