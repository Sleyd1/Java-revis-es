package hashmap;

import java.util.HashMap;

public class InventarioHashMap {
    public static void printFilteredInventoryKeySet(HashMap<String, Integer> inventory) {
        int productsBelow20 = 0;
        for (String item: inventory.keySet()){
            int quantity = inventory.get(item);
            if (quantity > 20){
                System.out.printf("Product: %s, Quantity: %d\n",item, quantity);
            } else {
                productsBelow20 += 1;
            }


        }

        if(productsBelow20 == inventory.size()){
            System.out.println("No products with quantity greater than 20");
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> product = new HashMap<>();
        product.put("LapTop", 15);
        product.put("Mouse",10);
        product.put("KeyBoard",9);

        printFilteredInventoryKeySet(product);

    }

}
