package hashmap;

import com.sun.jdi.Value;

import java.util.HashMap;

public class ModifyAndResetHashMap {
    public static void modifyAndResetHashMap(HashMap<String, Integer> data) {

        System.out.println("Is empty: " + data.isEmpty());
        System.out.println("Size: " + data.size());

        if(data.containsKey("Reset")){
            System.out.println("Size after modification: " + data.size());
        } else {
            data.put("Reset", 50);
            System.out.println("Size after modification: " + data.size());
        }

        data.clear();
        System.out.println("Is empty after clear: "+ data.isEmpty());




    }
    public static void main(String[] args) {
        HashMap<String, Integer> value = new HashMap<>();
        value.put("A55B", 50);
        value.put("B55A", 60);
        value.put("Reset", 60);
        modifyAndResetHashMap(value);

    }
}
