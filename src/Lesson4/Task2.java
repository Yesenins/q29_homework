package Lesson4;

public class Task2 {
    public static void main(String[] args) {
        int[] mass = {13, 15, -8, 19, 10, 18, -2, 9, 3, 4};
        int sum = 0;
        int max = mass[0];
        int min = mass[0];
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
            if(mass[i] > max){
                max = mass[i];
            }
            if(mass[i] < min){
                min = mass[i];
            }
        }
        System.out.println("Number of elements: "+ mass.length);
        System.out.println("Sum of elements: " + sum);
        System.out.println("Maximal element: " + max);
        System.out.println("Minimal element: " + min);
    }
}
