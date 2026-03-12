import java.util.HashSet;

public class Ejr14 {
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");

        HashSet<String> set2 = new HashSet<>(set1);

        System.out.println(set2);
    }
}