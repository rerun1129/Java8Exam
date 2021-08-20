package date;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {

    public static void main(String[] args) {

        //기계용시간
        /*System.out.println(Instant.now());
        System.out.println(Instant.ofEpochMilli(1000));

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
        ZonedDateTime zonedDateTime = Instant.now().atZone(zone);
        System.out.println(zonedDateTime);*/

       /* //사람용 시간
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //로컬의 특정일시
        LocalDateTime birth = LocalDateTime.of(1990,11,29,0,0,0);
        System.out.println(birth);

        //특정 지역의 시간
        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(nowInKorea);

        //특정 지역의 시간
        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime);  */

        /*LocalDate today = LocalDate.now();
        LocalDate thisYearBirthday = LocalDate.of(2021,11,29);
        Period period = Period.between(today,thisYearBirthday);
        System.out.println(period.getMonths()*30 + period.getDays());

        Period until = today.until(thisYearBirthday);
        System.out.println(until.get(ChronoUnit.DAYS));*/

        /*Instant now = Instant.now();
        Instant plus = now.plus(10,ChronoUnit.SECONDS);
        Duration between = Duration.between(now, plus);
        System.out.println(between.getSeconds());*/

        /*LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(dateTimeFormatter));

        LocalDate parse = LocalDate.parse("11/29/1990", dateTimeFormatter);
        System.out.println(parse);*/

        Date date = new Date();
        Instant instant = date.toInstant();

        Date newDate = Date.from(instant);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        LocalDateTime dateTime = gregorianCalendar.toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDateTime();

        ZonedDateTime dateTime1 = gregorianCalendar.toInstant()
                .atZone(ZoneId.systemDefault());
        GregorianCalendar.from(dateTime1);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime plus = now.plus(10,ChronoUnit.SECONDS);


    }
}
