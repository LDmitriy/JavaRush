package level_8;

import java.util.HashSet;
import java.util.Iterator;

public class Solution8_13 {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(51);
        set.add(25);
        set.add(53);
        set.add(1);
        set.add(12);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(6);
        set.add(11);
        set.add(7);
        set.add(13);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(-1);
        set.add(14);
        set.add(-2);
        set.add(-3);

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }
        return set;

    }

    public static void main(String[] args) {

    }
}
