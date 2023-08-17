import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(45);
        set2.add(34);
        set2.add(45);
        set1.add(3);
        set2.add(0);
        set2.add(1);
        set2.add(2);

        System.out.println(symmetricDifference(set1, set2));


    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {

        Set<Integer> setDifference = new HashSet<>(set1);
        setDifference.removeAll(set2);
        set2.removeAll(set1);
        setDifference.addAll(set2);

        return setDifference;
    }
}