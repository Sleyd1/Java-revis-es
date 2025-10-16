package dataandtime;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ConvertTime {
    public static String convertTime(String dateTimeStr, String sourceZone,
                                     String targetZone, boolean showOffset) {
        try {
            // Create formatters
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            DateTimeFormatter outputFormatter = showOffset ?
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm xxx") :
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            // Parse input datetime
            LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr, inputFormatter);

            // Create ZonedDateTime objects
            ZonedDateTime sourceDateTime = localDateTime.atZone(ZoneId.of(sourceZone));
            ZonedDateTime targetDateTime = sourceDateTime.withZoneSameInstant(ZoneId.of(targetZone));

            return String.format("Source: %s, Target: %s",
                    sourceDateTime.format(outputFormatter),
                    targetDateTime.format(outputFormatter));

        } catch (DateTimeParseException e) {
            return "Invalid datetime format";
        } catch (DateTimeException e) {
            return "Invalid time zone";
        }
    }
    public static void main(String[] args) {
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyo);
        System.out.println("-----------");
        ZonedDateTime newYork = tokyo.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(newYork);
        System.out.println();
        System.out.println("-------------------- test método --------------------");
        System.out.println();
        System.out.println(convertTime("2024-03-15 14:30",
                "America/New_York",
                "Asia/Tokyo",true));


    }
}
