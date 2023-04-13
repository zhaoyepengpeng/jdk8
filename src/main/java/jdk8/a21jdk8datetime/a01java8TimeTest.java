package jdk8.a21jdk8datetime;

import java.time.LocalDate;
import java.time.MonthDay;

public class a01java8TimeTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        //2023-04-12
        System.out.println(now);
        //APRIL
        System.out.println(now.getMonth());
        //2023,4,12
        System.out.println(now.getYear() + "," + now.getMonthValue() + "," + now.getDayOfMonth());

        LocalDate localDate = LocalDate.of(2023, 4, 25);
        System.out.println(localDate);

        //有月份和日，没有年份
        MonthDay monthDay = MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());
        System.out.println(monthDay);
        MonthDay monthDay1 = MonthDay.from(LocalDate.of(2021, 4, 15));
        System.out.println(monthDay1);
        if (monthDay.equals(monthDay1)) {
            System.out.println("monthDay equals monthDay1");
        } else {
            System.out.println("monthDay not equals monthDay1");
        }

    }
}

