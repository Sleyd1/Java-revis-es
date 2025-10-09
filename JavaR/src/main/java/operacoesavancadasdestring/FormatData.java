package operacoesavancadasdestring;

public class FormatData {
    public static String formatData(String name, double price, int quantity, String format) {


        if (name == null || price == 0 || quantity == 0|| format == null) return "Invalid input";

        if (name.equals("invalid") || format.equals("invalid")) return "Invalid input";
        String text = "";

        switch (format){
            case "basic" -> {
                text = String.format("ITEM: %s, PREÇO: $%.2f", name, price);
            }
            case "detailed" -> {
                text = String.format("PRODUCT: %s\nPRICE: $%.2f\nQUANTITY: %d", name, price, quantity);
            }
            case "total" -> {
                double total = price * (double)quantity;
                text = String.format("TOTAL FOR %dx %s: $%.2f",quantity, name, total);
            }
        }


        return text;
    }

    public static void main(String[] args) {
        System.out.println(formatData("Apple", 203030.4040,40,"detailed"));
    }
}
