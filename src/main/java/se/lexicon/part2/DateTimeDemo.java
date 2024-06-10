package se.lexicon.part2;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeDemo {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("Today: " + currentDate);
        System.out.println(currentDate.getMonth());  // JUNE
        System.out.println(currentDate.getMonthValue()); // 6

        System.out.println("Tomorrow Date: " + currentDate.plusDays(1));

        //LocalDate birthDate = LocalDate.parse("2022-02-25");
        LocalDate birthDate = LocalDate.of(2022,2,25);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        LocalTime startLecture = LocalTime.parse("09:00");
        System.out.println(startLecture);

        LocalTime endLecture = LocalTime.of(12,0,0);
        System.out.println(endLecture);

    }

}
