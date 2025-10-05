package hashset;

import java.util.HashSet;

public class SetDifference {
    public static void twoWaySetDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);

        HashSet<Integer> differenceSet2 = new HashSet<>(set2);
        differenceSet2.removeAll(set1);

        if (differenceSet.isEmpty() && differenceSet2.isEmpty()){
            System.out.println("No difference between sets.");
            return;
        }
        System.out.println("Difference (Set 1 - Set 2): "+ differenceSet);
        System.out.println("Difference (Set 2 - Set 1): "+ differenceSet2);


    }
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        twoWaySetDifference(set1,set2);
    }
}
