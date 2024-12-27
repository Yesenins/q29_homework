package Lesson9.service;

import Lesson9.domain.User;

public interface GameService {

    void validateBet(User user, int bet);

    void validateNumber(int number);

    boolean play(int number);

    void changeBalance(User user, int bet, boolean result);
}
