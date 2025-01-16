package Lesson12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,1,4,1,4,5,4,2,3,4,5,2,1);

        Map<Integer, Long> list2 = list.stream()
                .collect(Collectors.groupingBy(el -> el , Collectors.counting()));

        System.out.println(list2);
    }

}
