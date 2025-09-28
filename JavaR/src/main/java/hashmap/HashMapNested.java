package hashmap;

import java.util.HashMap;
import java.util.Map;

//HashMap Aninhado
public class HashMapNested {
    public static void printMostExpensiveProducts(HashMap<String, HashMap<String, Integer>> inventory) {
        if (inventory.isEmpty()) {
            System.out.println("No categories in inventory.");
            return;
        }

        String mostStockedProduct = null;
        int maxQuantity = Integer.MIN_VALUE;

        for (Map.Entry<String, HashMap<String, Integer>> entryCategory : inventory.entrySet()){
            if ( inventory.get(entryCategory.getKey()).isEmpty()){
                System.out.println("Category: " + entryCategory.getKey() +
                        "\n  No products available.");
                continue;
            }
            for (Map.Entry<String, Integer> entry: inventory.get(entryCategory.getKey()).entrySet()){
                if (entry.getValue() > maxQuantity) {
                    maxQuantity = entry.getValue();
                    mostStockedProduct = entry.getKey();
                }
            }
            System.out.println("Category: "+ entryCategory.getKey() +
                    "\n  Most Expensive Product: "+ mostStockedProduct + ", Price: " + maxQuantity);
            //System.out.println("Most Stocked Product: " + mostStockedProduct + ", Quantity: " + maxQuantity);
             mostStockedProduct = null;
             maxQuantity = Integer.MIN_VALUE;

        }
    }

    public static void main(String[] args) {
        HashMap<String, HashMap<String , Integer>> inventory = new HashMap<>();

        inventory.put("Eletrônicos", new HashMap<>());
        inventory.put("Móveis", new HashMap<>());
        //inventory.get("Eletrônicos").put("LapTop", 3000);
        //inventory.get("Eletrônicos").put("Mouse",190);
        inventory.get("Móveis").put("Sofá", 3000);
        inventory.get("Móveis").put("Poltrona",3450);

        printMostExpensiveProducts(inventory);


    }
}
