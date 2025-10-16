package dataandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ProcessDateTime {
    public static String processDateTime(String dateTimeStr, int amount, String unit, String operation) {
       
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime temp = LocalDateTime.parse(dateTimeStr,formatter);
            LocalDateTime newDateTimeStr;


            if (unit.toLowerCase().equals("hours")){
                switch (operation.toLowerCase()) {
                    case "add":
                        newDateTimeStr = temp.plusHours(amount);
                        break;
                    case "subtract":
                        newDateTimeStr = temp.minusHours(amount);
                        break;
                    default:
                        return "Invalid operation";
                }

            } else if (unit.toLowerCase().equals("days")){
                switch (operation.toLowerCase()) {
                    case "add":

                        newDateTimeStr = temp.plusDays(amount);
                        break;
                    case "subtract":
                        newDateTimeStr = temp.minusDays(amount);
                        break;
                    default:
                        return "Invalid operation";
                }


            } else if (unit.toLowerCase().equals("months")) {
                switch (operation.toLowerCase()) {
                    case "add":
                        newDateTimeStr = temp.plusMonths(amount);
                        break;
                    case "subtract":
                        newDateTimeStr = temp.minusMonths(amount);
                        break;
                    default:
                        return "Invalid operation";
                }

            } else {
                return "Invalid unit";
            }
            return String.format("Original: %s, New: %s, Day: %s",
                    temp.format(formatter), newDateTimeStr.format(formatter), newDateTimeStr.getDayOfWeek());

        } catch (DateTimeParseException e) {
            return "Invalid date time format";
        }


    }
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Hoje: "+ dateTime);

        System.out.println(processDateTime("2024-03-15 14:30",5,"days","add"));

    }
}
