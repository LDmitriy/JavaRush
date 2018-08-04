package level_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution8_23 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();


        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat s : cats) {
            System.out.println(s.toString());
        }
    }


    public static class Cat {

    }
}
