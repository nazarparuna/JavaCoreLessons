package lesson21.example.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate localDate = now.toLocalDate();
        LocalTime localTime = now.toLocalTime();

        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfMonth());

        LocalDateTime twoDaysAgo = now.minus(2, ChronoUnit.DAYS);
        System.out.println(twoDaysAgo);

        LocalDateTime truncatedTo = now.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(truncatedTo);

        System.out.println(localDate.isLeapYear());

        LocalDate date = LocalDate.parse("2019-12-02");
        System.out.println(date);

    }
}
