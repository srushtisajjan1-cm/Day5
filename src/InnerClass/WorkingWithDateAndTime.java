package InnerClass;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.time.LocalTime;
    import java.time.format.DateTimeFormatter;

public class WorkingWithDateAndTime {
    public static void main(String[] args){
        LocalDate date =  LocalDate.now();
        System.out.println("Date:" + date);
        LocalTime time =  LocalTime.now();
        System.out.println("Time:" + time);
        LocalDateTime datetime =  LocalDateTime.now();
        System.out.println("Date & Time:" +datetime);
       /* Display the day of the month
        Display the day of the Year
        Display the Week Name,Month Name,Month Number
        E-Name of the Day : (Mon-Sun)
        D-Day of the Year (1-366)
        dd-Day of the month (1-31)
        M-Month Number (1-12)
        MMM-Month name-Jan-Dec
                */

DateTimeFormatter format = DateTimeFormatter.ofPattern("D,E,MM dd yyyy");
String formattedDateTime = datetime.format(format);
        System.out.println("Formatted Date:"+formattedDateTime);
    }

}
