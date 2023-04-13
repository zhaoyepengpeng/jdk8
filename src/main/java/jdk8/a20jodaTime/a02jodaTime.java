package jdk8.a20jodaTime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;


import java.util.Date;

public class a02jodaTime {
    public static void main(String[] args) {
        //标准UTC时间格式  2014-11-04T09:21:22.856Z  Z表示没有时区限制
        //标准UTC时间格式  2014-11-04T09:21:22.856+08:00    +08:00表示东八区时间
        System.out.println(convertUTC2Date("2014-11-04T09:21:22.856Z"));
        System.out.println(convertDate2UTC(new Date()));
        System.out.println(convertDate2LocalByDateFormat(new Date(), "yyyy-MM-dd HH:mm:ss"));
    }

    public static Date convertUTC2Date(String utcDate) {
        try {
            DateTime dateTime = DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
            return dateTime.toDate();
        } catch (Exception exception) {
            return null;
        }
    }

    public static String convertDate2UTC(Date javaDate) {
        try {
            DateTime dateTime = new DateTime(javaDate, DateTimeZone.UTC);
            return dateTime.toString();
        } catch (Exception exception) {
            return null;
        }
    }

    public static String convertDate2LocalByDateFormat(Date javaDate, String dateFormat) {
        try {
            DateTime dateTime = new DateTime(javaDate);
            return dateTime.toString(dateFormat);
        } catch (Exception exception) {
            return null;
        }
    }
}
