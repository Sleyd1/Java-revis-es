package fluxodecontroleavancado;

public class ExtendedValue {
    public static String processExtendedValue(Object value) {
        if(value instanceof Integer i){
            if (i % 2 == 0){
                return "Even Number: " + (i * 3);
            } else {
                return "Odd Number: " + (i * 2);
            }
        } else if (value instanceof String text) {
            if(text.length() > 5){
                return "Long Text: "+ text.toLowerCase();
            }
            return "Short Text: " + text.toUpperCase();
        } else if (value instanceof Boolean b) {
            if (b){
                return "Boolean: Yes" ;
            }

            return "Boolean: No";
        }else {
            return "Unsupported Type";
        }


    }
    public static void main(String[] args) {
        Object value = true;
        System.out.println(processExtendedValue(value));

    }
}
