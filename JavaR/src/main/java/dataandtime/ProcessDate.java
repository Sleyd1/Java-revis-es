package dataandtime;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

public class ProcessDate {
    public static String processDate(String dateStr, int days, String operation) {
        try {
            LocalDate date = LocalDate.parse(dateStr);
            LocalDate newDate;

            switch (operation.toLowerCase()) {
                case "add":
                    newDate = date.plusDays(days);
                    break;
                case "subtract":
                    newDate = date.minusDays(days);
                    break;
                default:
                    return "Invalid operation";
            }

            return String.format("Original: %s, New: %s, Day of week: %s",
                    date, newDate, newDate.getDayOfWeek());

        } catch (DateTimeParseException e) {
            return "Invalid date format";
        }



    }
    public static void main(String[] args) {
        System.out.println(processDate("2024-03-15", 5,"add"));

    }
}
