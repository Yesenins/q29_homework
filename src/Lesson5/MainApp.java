package Lesson5;

public class MainApp {
    public static void main(String[] args) {

        Student glen = new Student("Glen", "Petyhov", 27);
        Student serega = new Student("Serega", "Coolman", 27, 5);
        Student vlad = new Student("Vlad", "Islove");


        System.out.println(glen.fullName());
        System.out.println(serega.fullName());
        System.out.println(vlad.fullName());

       serega.attends();
       glen.attends();
       vlad.attends();

       vlad.numberOfVisits = 4;
       vlad.attends();

    }
}
