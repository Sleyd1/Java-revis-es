package hashset;

import java.util.HashSet;

public class IntersecaoDeHashSet {

    public static void intersectionWithSubsetCheck(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: "+ intersection);
        if (intersection.isEmpty()){
            System.out.println("No common elements.");
        } else if (intersection.containsAll(set1)){
            System.out.println("Set 1 is fully contained in Set 2");
        } else if(intersection.containsAll(set2)){
            System.out.println("Set 2 is fully contained in Set 1");
        }else {
            System.out.println("Partial intersection");
        }

    }

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        intersectionWithSubsetCheck(set1,set2);
    }
}
