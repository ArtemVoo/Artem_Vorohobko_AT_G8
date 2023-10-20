package homework.day5.String_task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatChanging {
    public void changeDateFormat(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        String formattedDateTime = dateTime.format(formatter2);

        System.out.println(formattedDateTime);
    }
}
