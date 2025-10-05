package hashset;

import java.util.HashSet;

public class SubESuperConjuntos {
    public static void checkProperSubsetSuperset(HashSet<String> setA, HashSet<String> setB) {
        boolean isSubset = setB.containsAll(setA);
        boolean isSubsetB = setA.containsAll(setB);
        /*
        * Um subconjunto próprio significa que setA é um subconjunto, mas setB tem elementos adicionais.
        * Um superconjunto adequado significa que setB é um superconjunto, mas setA não é igual a setB.
        * */
        boolean properSubset = setA.size() < setB.size();
        boolean properSubsetB = setA.size() > setB.size();
        System.out.println("setA is a subset of setB: " + isSubset);
        System.out.println("setB is a superset of setA: " + isSubset);
        System.out.println("setA is a proper subset of setB: " + properSubset);
        System.out.println("setB is a proper superset of setA: " + (isSubsetB && properSubset || properSubsetB));
    }
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<>();
        //setA.add("Banana");
        //setA.add("Apple");
        //setA.add("Orange");
        HashSet<String> setB = new HashSet<>();
        //setB.add("Banana");
        //setB.add("Apple");
        //setB.add("Orange");
        checkProperSubsetSuperset(setA,setB);
    }
}
