package jdk8.a21jdk8datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.TreeSet;

public class a02LocalTimeTest {
    //48 49集
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        //10:06:50.469
        System.out.println(now);
        //14:16:50.469
        LocalTime localTime = now.plusHours(4L).plusMinutes(10);
        System.out.println(localTime);
        System.out.println("==============================================");
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.plus(2, ChronoUnit.WEEKS);
        System.out.println(localDate1);
        LocalDate localDate2 = localDate.minus(2, ChronoUnit.MONTHS);
        System.out.println(localDate2);
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());
        System.out.println("==============================================");
        LocalDate localDate3 = LocalDate.of(2017, 5, 18);
        LocalDate localDate4 = LocalDate.of(2017, 5, 19);
        System.out.println(localDate3.isAfter(localDate4));
        System.out.println(localDate3.isBefore(localDate4));
        System.out.println(localDate3.equals(localDate4));
        System.out.println("==============================================");

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        TreeSet<String> treeSet = new TreeSet<String>() {
            {
                addAll(availableZoneIds);
            }
        };
        //America/Resolute
        //America/Rio_Branco 有好多，只列举出来两个
        treeSet.stream().forEach(System.out::println);

        ZoneId zoneId = ZoneId.of("America/Santiago");
        System.out.println("==============================================");
        LocalDateTime localDateTime = LocalDateTime.now();
        //2023-04-13T10:38:00.656
        System.out.println(localDateTime);
        System.out.println("==============================================");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        //2023-04-13T10:39:18.916-04:00[America/Santiago]
        System.out.println(zonedDateTime);

        System.out.println("==============================================");
        //YearMonth测试
        YearMonth yearMonth = YearMonth.now();
        yearMonth = YearMonth.of(2023, 2);
        //2023-04
        System.out.println(yearMonth);
        //365一年有多少天
        System.out.println(yearMonth.lengthOfYear());
        //30 这个月份有多少天
        System.out.println(yearMonth.lengthOfMonth());
        //是否是闰年
        System.out.println(yearMonth.isLeapYear());

        System.out.println("==============================================");
        LocalDate localDate5 = LocalDate.of(2023, 04, 12);//LocalDate.now();
        LocalDate localDate6 = LocalDate.of(2027, 3, 25);
        //Period周期性的
        Period period = Period.between(localDate5, localDate6);
        //上面两个时间的间隔是3年11个月12天，并没有将年换算成月，也没有将月换算成天
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println("==============================================");

        //2023-04-13T04:57:01.910Z 是UTC时间
        System.out.println(Instant.now());


    }
}
