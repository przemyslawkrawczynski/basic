package zegary;

import java.sql.SQLOutput;
import java.util.LinkedList;

class Clock {

    Integer hour;
    Integer minute;
    Integer second;

    public Clock(Integer hour, Integer minute, Integer second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }
}

public class Program {

    public static void main(String[] args) {

        Clock zegar1 = new Clock(6, 10, 00);
        Clock zegar2 = new Clock(7, 14, 01);
        Clock zegar3 = new Clock(4, 45, 25);
        Clock zegar4 = new Clock(15, 41, 45);

        LinkedList<Clock> zegary = new LinkedList<Clock>();
        zegary.add(zegar1);
        zegary.add(zegar2);
        zegary.add(zegar3);
        zegary.add(zegar4);

        for (Clock zegar : zegary) {
            int currentMinutes = zegar.getMinute();
            System.out.println("Current time of " + zegar.getClass() + " is: " + zegar.getHour() + ":"+ zegar.getMinute() +":" + zegar.getSecond());
            zegar.setMinute(currentMinutes + 1);
            System.out.println("Current time of " + zegar.getClass() + " is: " + zegar.getHour() + ":"+ zegar.getMinute() +":" + zegar.getSecond());
        }

    }
}
