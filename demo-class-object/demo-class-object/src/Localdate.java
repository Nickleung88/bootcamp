import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Localdate {
  public static void main(String[] args) {
    // local date
    LocalDate date = LocalDate.of(2024, 11, 30);
    System.out.println(date);// 2024-11-30

    System.out.println(date.getDayOfWeek());// SATURDAY
    System.out.println(date.plusDays(1)); // 2024-12-01

    System.out.println(date.plusMonths(2));// 2025-01-30
    System.out.println(date.plusYears(3));// 2027-11-30
    System.out.println(date);// 2024-11-30

    System.out.println(date.minusDays(6));// 2024-11-24

    LocalDate date2 = LocalDate.of(2024, 11, 30);
    System.out.println(date.equals(date2));// true
    System.out.println(date == date2); // false. == is for check object

    LocalDate date3 = LocalDate.of(2024, 12, 2);
    // the author of Localdate designed the method CompareTo)()
    System.out.println(date2.compareTo(date3)); // -1
    System.out.println(date3.compareTo(date2)); // 1

    // Integer, Double -> equals(), compareTo().
    Double d3 = 3.3;
    Double d4 = 3.4;
    System.out.println(d3.compareTo(d4));
    System.out.println(d3 < d4);

    LocalDateTime dateTime = LocalDateTime.of (2024, 10, 1, 23, 55, 59);
    System.out.println(dateTime);
    System.out.println(dateTime.getSecond());
    System.out.println(dateTime.plusSeconds(2));

    //
    Date date4 = Date.valueOf("2024-10-12");
    System.out.println(date4.getTime());

    LocalDate date5 = dateTime.toLocalDate();
    System.out.println(date5);
  }
}
