import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Java8DateCompareOp {
    public static void main(String[] args) {

        LocalDate today1 = LocalDate.now();  //1 - Recommended
        System.out.println(today1);
        LocalDate dateInstance1 = LocalDate.of(2019, 3, 27);
        LocalDate dateInstance2 = LocalDate.parse("2019-03-27");
        System.out.println(dateInstance1 + " and " + dateInstance2);

        String date = "2019-03-23";
        LocalDate localDate = LocalDate.parse(date);

//2 - specific date pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        String date1 = "23-Mar-2019";
        LocalDate localDate2 = LocalDate.parse(date1, formatter);
        System.out.println(localDate + " and " + localDate2);
//4. How to format LocalDate to string
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d-MMM-yyyy");

        LocalDate today = LocalDate.now();

        String dateString = today.format(formatter2);    //23-Mar-2019
        System.out.println(dateString + " and " + today);

    }
}
