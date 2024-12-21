package Lesson8;

import Lesson8.domain.AndroidPhone;
import Lesson8.domain.ApplePhone;
import Lesson8.domain.Phone;
import Lesson8.domain.WindowsPhone;
import Lesson8.service.QualityControlOfRepairs;

public class MainApp {
    public static void main(String[] args) {
        Phone androidPhone = new AndroidPhone();
        Phone applePhone = new ApplePhone();
        Phone windowsPhone = new WindowsPhone();

        Phone phone = new Phone() {
            @Override
            public void firmware() {
                System.out.println("Firmware version phone 1,1");
            }
        };

        QualityControlOfRepairs control = new QualityControlOfRepairs("+375332835694",54);
        control.check(androidPhone);
        System.out.println();
        control.check(applePhone);
        System.out.println();
        control.check(windowsPhone);
        System.out.println();
        control.check(phone);



    }
}
