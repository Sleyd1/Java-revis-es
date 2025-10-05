package hashset;

import java.util.HashSet;

public class IterandoHashSet {

    public static void printSetWithCount(HashSet<String> set) {
        int numberCont = 0;
        for (String setIterar: set){
            numberCont++;
            System.out.println(setIterar);
        }

        System.out.println("Total elements: "+ numberCont);
    }

    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<>();
        setA.add("Banana");
        setA.add("Apple");
        setA.add("Orange");
        printSetWithCount(setA);

    }
}
