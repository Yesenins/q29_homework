package Lesson9.service.impl;

import Lesson9.domain.User;
import Lesson9.exeption.BasicValidationExeption;
import Lesson9.service.GameService;

public class GameServiceImpl implements GameService {

    @Override
    public void validateBet(User user, int bet) {
        if(bet > user.getBalance()){
            throw new BasicValidationExeption("Your bet is more than the amount your balance is " + user.getBalance() + ", please make another bet");
        } else if(bet > 100){
            throw new BasicValidationExeption("Your bet is more than allowed (100 rubles), please make another bet");
        } else if (bet < 0) {
            throw new BasicValidationExeption("The bet cannot be negative, please make another bet");
        }
    }

    @Override
    public void validateNumber(int number) {
        if(number < -1 || number > 5){
            throw new BasicValidationExeption("The selected number is outside the valid range");
        }
    }

    @Override
    public boolean play(int number) {
        return number == (int)(Math.random()*5);
    }

    @Override
    public void changeBalance(User user, int bet, boolean result) {
        if(result){
            user.setBalance(user.getBalance() + bet);
            System.out.println("You won");
        }else{
            user.setBalance(user.getBalance() - bet);
            System.out.println("You lost");
        }
    }
}
