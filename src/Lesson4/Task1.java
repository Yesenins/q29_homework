package Lesson4;

public class Task1 {
    public static void main(String[] args) {
        int[] mass1 = {3, 5, 1, 9, 13, 0, 7, 19, 17};
        int[] mass2 = {1, 0, 9, 8, 10, -4, 3};
        for (int i = 0; i < mass1.length ; i++) {
            for (int j = 0; j < mass2.length; j++) {
                if(mass1[i] == mass2[j]){
                    System.out.println(mass1[i]);
                }
            }
        }
    }
}