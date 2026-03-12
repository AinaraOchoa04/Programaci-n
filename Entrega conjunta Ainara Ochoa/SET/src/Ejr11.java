import java.util.TreeSet;

public class Ejr11 {
    public static void main(String[] args) {

        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        set1.add(1);
        set1.add(2);

        set2.add(1);
        set2.add(2);
        set2.add(3);

        if (set2.containsAll(set1)) {
            System.out.println("set1 es subconjunto de set2");
        }
    }
}