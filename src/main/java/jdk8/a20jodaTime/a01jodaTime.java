package jdk8.a20jodaTime;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class a01jodaTime {
    public static void main(String[] args) {
        //导入maven依赖
        DateTime today = new DateTime();
        DateTime tomorrow = today.plusDays(1);
        System.out.println(today.toString("yyyy-MM-dd"));
        System.out.println(tomorrow.toString("yyyy-MM-dd"));
        DateTime d1 = today.withDayOfMonth(1);
        System.out.println(d1.toString("yyyy-MM-dd"));
        System.out.println("=================================");
        LocalDate localDate = new LocalDate();
        System.out.println(localDate.toString("yyyy-MM-dd"));
        System.out.println("=================================");
        LocalDate localDate1 = localDate.plusMonths(3).dayOfMonth().withMinimumValue();
        System.out.println(localDate1.toString("yyyy-MM-dd"));
        LocalDate localDate2 = localDate.plusMonths(3).dayOfMonth().withMaximumValue();
        System.out.println(localDate2.toString("yyyy-MM-dd"));
        System.out.println("=================================");
        //计算两年前第三个月最后一天的日期
        DateTime dateTime = new DateTime();
        DateTime dateTime1 = dateTime.minusYears(2).monthOfYear().setCopy(3).dayOfMonth().withMinimumValue();
        System.out.println(dateTime1.toString("yyyy-MM-dd"));


    }
}
