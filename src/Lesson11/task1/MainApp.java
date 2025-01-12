package Lesson11.task1;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(8);
        list.add(1);
        list.add(8);
        list.add(1);
        list.add(4);
        list.add(9);

        DuplicateList duplicateList = new DuplicateList();

        var newMap = duplicateList.getDuplicateListWithNumberOfRepeats(list);

        System.out.println(newMap);

    }
}

