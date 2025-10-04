package checkmultipleelementshashset;


import java.util.HashSet;

public class CompareSet {
    public static void compareteSet(HashSet<String> set, HashSet<String> set2) {


        System.out.println("Set 1 Empty: " + set.isEmpty());
        System.out.println("Set 2 Empty: " + set2.isEmpty());
        System.out.println("Set 1 Size: " + set.size());
        System.out.println("Set 2 Size: " + set2.size());
        boolean tamanho = set.size() == set2.size();

        if (tamanho){
            System.out.println("Same Size: " + tamanho);
        } else {
            System.out.println("Same Size: " + tamanho);
        }

    }

    public static void main(String[] args) {
        HashSet<String> test1 = new HashSet<>();
        HashSet<String> test2 = new HashSet<>();

        compareteSet(test1, test2);
    }
}
