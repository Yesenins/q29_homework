package Lesson5;

public class Student {
    public String name;
    public String surname;
    public int age;
    public int numberOfVisits;

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student(String name, String surname, int age, int numberOfVisits){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.numberOfVisits = numberOfVisits;
    }

    public String fullName(){
        return name + " " + surname;
    }

    public void attends(){
        System.out.printf("%s attends %d classes\n", surname, numberOfVisits);
    }


}
