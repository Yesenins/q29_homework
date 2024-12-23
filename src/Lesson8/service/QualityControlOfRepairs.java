package Lesson8.service;

import Lesson8.domain.Phone;

public class QualityControlOfRepairs{

    private String number;
    private int volume;

    public QualityControlOfRepairs(String number,int volume) {
        this.number = number;
        this.volume = volume;
    }

    public void check(Phone phone){
        phone.call(number);
        phone.play(volume);
        phone.firmware();
   }


}
