import java.util.HashSet;

public class Ejr15 {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        HashSet<Integer> soloSet1 = new HashSet<>(set1);
        soloSet1.removeAll(set2);

        HashSet<Integer> soloSet2 = new HashSet<>(set2);
        soloSet2.removeAll(set1);

        System.out.println("Solo en set1: " + soloSet1);
        System.out.println("Solo en set2: " + soloSet2);
    }
}