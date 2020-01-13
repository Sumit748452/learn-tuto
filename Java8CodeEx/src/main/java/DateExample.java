import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateExample {

    public static void main(String[] args) {


        LocalDate lDate = LocalDate.now();
        lDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println(lDate.format(DateTimeFormatter.ofPattern("dd-MMM-yy")));

        // LocalDate lDate= LocalDate.of(2019,11,30);
        System.out.println(lDate.toString());
        System.out.println(lDate.getDayOfWeek());
        System.out.println(lDate.getDayOfMonth());
        System.out.println(lDate.getEra());
        System.out.println(lDate.getDayOfYear());
        System.out.println(lDate.getMonth());
        System.out.println(lDate.getMonthValue());
        System.out.println(lDate.getYear());
        System.out.println(lDate.isLeapYear());

        LocalTime localTime = LocalTime.now();     //toString() in format 09:57:59.744

        // LocalTime localTime = LocalTime.of(12, 20);
        System.out.println(localTime.toString());    //12:20
        System.out.println(localTime.getHour());     //12
        System.out.println(localTime.getMinute());   //20
        System.out.println(localTime.getSecond());   //0
        System.out.println(localTime.MIDNIGHT);      //00:00
        System.out.println(localTime.NOON);          //12:00


        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("YYYY-mm-dd HH:mm:ss")));

        System.out.println(localDateTime.toString());      //2013-05-15T10:01:14.911
        System.out.println(localDateTime.getDayOfMonth()); //15
        System.out.println(localDateTime.getHour());       //10
        System.out.println(localDateTime.getNano());       //911000000


        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime.toString());

        //1) Convert string to date in ISO8601 format
        String armisticeDate = "2016-04-04";

        LocalDate aLD = LocalDate.parse(armisticeDate);
        System.out.println("Date: " + aLD);

        String armisticeDateTime = "2016-04-04T11:50";

        LocalDateTime aLDT = LocalDateTime.parse(armisticeDateTime);
        System.out.println("Date/Time: " + aLDT);

        //2) Convert string to date in custom formats
        String anotherDate = "04 Apr 2016";

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
        LocalDate random = LocalDate.parse(anotherDate, df);

        System.out.println(anotherDate + " parses as " + random);

        //add and minus date
        LocalDate today = LocalDate.now();
        today.plusYears(1);
        System.out.println("After 1 Years:::" + today);


    }

}
