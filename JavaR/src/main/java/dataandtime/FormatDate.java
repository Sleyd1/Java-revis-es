package dataandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Locale;

public class FormatDate {
    public static String formatDate(String dateStr, String inputPattern, String outputPattern)
            throws DateTimeParseException {
        final String[] FORMATES = { "yyyy-MM-dd", "MMMM d, yyyy","MM/dd/yy"};
        // "MMMM d, yyyy" precisa adicionar a linguagem local DateTimeFormatter
        final String[] ENTR = {"basic","long", "short"};
        DateTimeFormatter[] test = new DateTimeFormatter[FORMATES.length];
        HashMap<String, DateTimeFormatter> valores= new HashMap<>();
        LocalDate date;


        for (int i = 0; i < FORMATES.length; i++){
            test[i] = DateTimeFormatter.ofPattern(FORMATES[i], Locale.ENGLISH);
            valores.put(ENTR[i],test[i]);
        }

        if (!outputPattern.toLowerCase().equals(ENTR[0]) && !outputPattern.toLowerCase().equals(ENTR[1]) &&
                !outputPattern.toLowerCase().equals(ENTR[2])){
            DateTimeFormatter customForm = DateTimeFormatter.ofPattern(outputPattern);
            date = LocalDate.parse(dateStr, valores.get(inputPattern.toLowerCase()));

            return String.format("%s", date.format(customForm));
        }

        if (valores.get(inputPattern.toLowerCase()) == null || valores.get(outputPattern.toLowerCase()) == null){
            return "Invalid pattern";
        }

        date = LocalDate.parse(dateStr,valores.get(inputPattern.toLowerCase()));

        return String.format("%s", date.format(valores.get(outputPattern.toLowerCase())));



    }
    public static void main(String[] args) {
        /*´somente a resposta do método pode ser customizada*/
        try {
            System.out.println(formatDate("04/15/06","short","dd.MM.yyyy"));

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format");
        } catch (IllegalArgumentException e){
            System.out.println("Invalid pattern");
        }

    }
}
