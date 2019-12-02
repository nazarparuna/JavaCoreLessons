package lesson21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;

public class AppDates {
    public static void main(String[] args) {

        // local date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        // plus time
        System.out.println(localDate.plusMonths(2));


        // getEra
        System.out.println(localDate.getEra());
        System.out.println(localDate.minusYears(2020).getEra());

        // is leap year
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.plusYears(1).isLeapYear());


        // start of day
        System.out.println(localDate.atStartOfDay());

        // of epoch time
        System.out.println(LocalDate.ofEpochDay(1));

        LocalDate date = LocalDate.parse("1970-01-31");
        System.out.println(date);
        System.out.println(date.plusYears(30));

        // create local time
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        // plus time
        System.out.println(localTime.plusHours(1));

        // trunkated to
        System.out.println(localTime.truncatedTo(ChronoUnit.MINUTES));

        // create local date time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(localDateTime.toLocalTime());

        // plus

        //parse

        LocalDateTime parse = LocalDateTime.parse("2019-12-02T20:10");
        System.out.println(parse);
        System.out.println(parse.getSecond());

        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar.getTime());
        System.out.println(calendar.getTime().getDate());
//        System.out.println(calendar.get());


    }
}
