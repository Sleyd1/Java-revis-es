package dataandtime;

import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class CalculateDifference {
    public static String calculateDifference(String start, String end, String unit, String format)
            throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime tempStar = LocalDateTime.parse(start,formatter);
        LocalDateTime tempEnd = LocalDateTime.parse(end,formatter);

        //Period

        int ano = tempEnd.getYear() - tempStar.getYear() ;
        int month = tempEnd.getMonthValue() - tempStar.getMonthValue();
        int day = tempEnd.getDayOfMonth() - tempStar.getDayOfMonth() ;

        //Duration
        int dias = ano * 365;
        int hours = dias * 24;
        int minut = hours * 60;


        if (unit.toLowerCase().equals("period")){
            Period period = Period.of(ano,month,day);

            switch (format){
                case "full":
                    return String.format("Years: %d, Months: %d, Days: %d ",
                            period.getYears(), period.getMonths(),period.getDays());

                case"simple" :
                    return String.format("%dy%dm%dd ",
                            period.getYears(), period.getMonths(),period.getDays());
                default:
                    return "Invalid format";
            }



        } else if (unit.toLowerCase().equals("duration")) {
            Duration duration = Duration.ofHours(hours);
            Duration duration1 = Duration.ofMinutes(minut);

            switch (format){
                case "full":
                    return String.format("Hours: %d, Minutes: %d ",
                        duration.toHours(), duration1.toMinutes());
                case "simple":
                    return String.format("%dh%dm ",
                            duration.toHours(), duration1.toMinutes());
                default:
                    return "Invalid format";
            }
        } else {
            return "Invalid unit";
        }

    }

    public static void main(String[] args) {
        try {
            System.out.println(calculateDifference("2006-04-15 10:30","2025-10-16 14:45",
                            "duration","full"));
        }catch (DateTimeParseException e){
            System.out.println("Invalid date format");
        }

    }
}
