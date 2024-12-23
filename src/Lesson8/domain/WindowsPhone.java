package Lesson8.domain;

public class WindowsPhone extends Phone{

    @Override
    public void call(String phoneNumber) {
        System.out.println("call test failed");
    }

    @Override
    public void firmware() {
        System.out.println("Firmware version windowsPhone 5,0");
    }
}
