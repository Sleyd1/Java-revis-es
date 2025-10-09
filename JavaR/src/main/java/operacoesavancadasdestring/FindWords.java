package operacoesavancadasdestring;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWords {
    public static String findWords(String text, String word) {

        if(text == null || word == null) return"Invalid input";
        Pattern pattern = Pattern.compile(word);

        Matcher matcher = pattern.matcher(text);

        String number = "";

        boolean wordNotFound = false;

        while(matcher.find()){
            number += matcher.start() + " ";

        }

        if(number.isEmpty()){
            return "Not found";
        }

        return number;


    }

    public static void main(String[] args) {
        System.out.println(findWords("the cat is black cat", "cat"));
    }
}
