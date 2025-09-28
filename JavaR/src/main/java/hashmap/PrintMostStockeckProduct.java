package hashmap;

import java.util.HashMap;
import java.util.Map;

public class PrintMostStockeckProduct {
    public static void printMostStockedProduct(HashMap<String, Integer> inventory) {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }

        String mostStockedProduct = null;
        int maxQuantity = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() > maxQuantity) {
                maxQuantity = entry.getValue();
                mostStockedProduct = entry.getKey();
            }
        }

        System.out.println("Most Stocked Product: " + mostStockedProduct + ", Quantity: " + maxQuantity);






    }

    public static void main(String[] args) {

        HashMap<String, Integer> value = new HashMap<>();
        value.put("A55B", 50);
        value.put("B55A", 60);
        value.put("Reset", 60);

        printMostStockedProduct(value);

    }
}
