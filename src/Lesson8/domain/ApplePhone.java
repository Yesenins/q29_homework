package Lesson8.domain;

public class ApplePhone extends Phone{

    @Override
    public void firmware() {
        double version = (double)(Math.random()*8.9 + 1.1);
        System.out.printf("Firmware version apple %.1f \n",version);
    }
}
