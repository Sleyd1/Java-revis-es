package fluxodecontroleavancado;

public class SwitchExpressions {
    public static String getMealType(int hour, boolean abbreviated) {
        switch (hour){
            case 5,6,7,8,10 -> {
                if(abbreviated){
                    return "BKT";
                }

                return "BREAKFAST";
            }

            case 11,12,13,14,15 -> {
                if(abbreviated){
                    return "LCH";
                }
                return "LUNCH";
            }

            case 16,17,18,19,20 -> {
                if(abbreviated){
                    return "DNR";
                }
                return "DINNER";
            }
            default -> {
                if (abbreviated){
                    return "SNK";
                }
                return "SNACK";
            }
        }

    }
    public static void main(String[] args) {

        System.out.println(getMealType(6, true));

    }
}
