package Lesson8.domain;

public abstract class Phone {

    public void call(String phoneNumber){
        System.out.println("test call accepted");
    }

    public void play(int volumeLevel){
        System.out.println("Music is played at a volume " + volumeLevel +"%");
    }

    public abstract void firmware();
}
