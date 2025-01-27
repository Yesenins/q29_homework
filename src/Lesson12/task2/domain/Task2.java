package Lesson12.task2.domain;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {

        List<User> users = List.of(new User("Serega", 27),
                new User("Anton", 31),
                new User("Danila", 29),
                new User("Masha", 22),
                new User("Anton", 35),
                new User("Danila", 40),
                new User("Vasiliy", 19));

        Set<String> uniqueUsers= users.stream()
                .map(User::getName)
                .collect(Collectors.toSet());

        System.out.println(uniqueUsers);

        var sortUsers = users.stream()
                .sorted((x,y) -> x.getAge().compareTo(y.getAge()))
                .toList();

        System.out.println(sortUsers);
    }
}
