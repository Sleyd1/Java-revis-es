package hashset;

import java.util.HashSet;

public class UniaoHashSet {
    public static void unionWithSubsetCheck(HashSet<Integer> set1, HashSet<Integer> set2) {
        if (set2.containsAll(set1)){
            System.out.println("Set 1 is a subset of Set 2");
        } else if (set1.containsAll(set2)){
            System.out.println("Set 2 is a subset of Set 1");
        } else {
            System.out.println("No subset relation");
        }

        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);


    }
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(2);
        unionWithSubsetCheck(set1,set2);
    }
}
