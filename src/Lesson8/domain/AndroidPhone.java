package Lesson8.domain;

public class AndroidPhone extends Phone{

    @Override
    public void firmware() {
        double version = (double)(Math.random()*8.9 + 1.1);
        System.out.printf("Firmware version android %.1f \n",version);
    }
}
