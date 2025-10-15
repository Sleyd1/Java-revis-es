package dataandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class ProcessTime {
    public static String processTime(String timeStr, int amount, String unit, String operation) {

        try {
            LocalTime time = LocalTime.parse(timeStr);
            LocalTime newTime;

            if (unit.toLowerCase().equals("hours")){
                switch (operation.toLowerCase()) {
                    case "add":
                        newTime = time.plusHours(amount);
                        break;
                    case "subtract":
                        newTime = time.minusHours(amount);
                        break;
                    default:
                        return "Invalid operation";
                }
                return String.format("Original: %s, New: %s",
                        time, newTime);

            } else if (unit.toLowerCase().equals("minutes")) {
                switch (operation.toLowerCase()) {
                    case "add":
                        newTime = time.plusMinutes(amount);
                        break;
                    case "subtract":
                        newTime = time.minusMinutes(amount);
                        break;
                    default:
                        return "Invalid operation";
                }

                return String.format("Original: %s, New: %s",
                        time, newTime);

            } else {
                return "Invalid unit";
            }

        } catch (Exception e) {
            return "Invalid time format";
        }

    }
    public static void main(String[] args) {
        System.out.println(processTime("23:40", 30, "minutes","add"));
    }
}
