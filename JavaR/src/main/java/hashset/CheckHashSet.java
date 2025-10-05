package hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class CheckHashSet {

    public static void checkMultipleElements(HashSet<String> set, ArrayList<String> elements) {
        if(elements.isEmpty()){
            System.out.println("without elements");
            return;
        }

        for (int i = 0; i < elements.size(); i++){
            System.out.println(set.contains(elements.get(i)));
        }
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        ArrayList<String> elements = new ArrayList<>();
        elements.add("Banana");
        elements.add("Grapes");
        elements.add("Apple");

        checkMultipleElements(set,elements);


    }
}
