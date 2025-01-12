package Lesson11.task2;

import Lesson11.task2.domain.User;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        TreeSet<User> treeSet = new TreeSet<>();

        treeSet.add(new User("Serega", 27));
        treeSet.add(new User("Diana", 30));
        treeSet.add(new User("Serega", 25));
        treeSet.add(new User("Glen", 26));
        treeSet.add(new User("Andy", 22));
        treeSet.add(new User("Glen", 35));

        Set<String> names = new HashSet<>();
        for (var user : treeSet){
            names.add(user.getName());
        }

        System.out.println(names);


        System.out.println(treeSet);
    }

}
