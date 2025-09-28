package hashmap;

import java.util.HashMap;
//Inventorio de produtos
public class AcessandoValores {
    public static void updateInventory(HashMap<String, Integer> inventory, String productName, int quantityToAdd) {

        if(inventory.containsKey(productName)){
            Integer valor = inventory.get(productName) + quantityToAdd;
            inventory.put(productName, valor);
            System.out.printf("Produto %s atualizado com sucesso\n", productName);
            System.out.println(inventory);

        } else {
            inventory.put(productName, quantityToAdd);
            System.out.printf("produto %s adicionado com sucesso\n", productName);
            System.out.println(inventory);
        }


    }


    public static void main(String[] args) {

        String productName = "Iphone";
        int quantityToAdd = 20;

        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("LapTop", 50);
        inventory.put("Mouse",40);
        inventory.put("KeyBoard",70);

        updateInventory(inventory, productName, quantityToAdd);

    }
}
