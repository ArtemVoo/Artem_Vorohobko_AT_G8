package homework.day5.stringTasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateAndTime {
    public void printCurrentDateAndTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM, yyyy, H 'часа' mm 'минут' ");
        String formattedDateTime = now.format(formatter);

        System.out.println("Сейчас на дворе : " + formattedDateTime);
    }
}
