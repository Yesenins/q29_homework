package Lesson5;

public class MainApp {
    public static void main(String[] args) {

        Student glen = new Student("Glen", "Petyhov", 27);
        Student serega = new Student("Serega", "Coolman", 27, 5);
        Student vlad = new Student("Vlad", "Islove");


        System.out.println(glen.getfullName());
        System.out.println(serega.getfullName());
        System.out.println(vlad.getfullName());

       serega.printLessonsCount();
       glen.printLessonsCount();
       vlad.printLessonsCount();

       vlad.numberOfVisits = 4;
       vlad.printLessonsCount();

    }
}
