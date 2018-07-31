package level_8;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution8_6 {
    public static Object createArrayList() {
        ArrayList<Object> arrayList = new ArrayList<>();
        return arrayList;
    }

    public static Object createLinkedList() {
        LinkedList<Object> linkedList = new LinkedList<>();
        return linkedList;
    }

    public static void main(String[] args) {
        createArrayList();
        createLinkedList();
    }
}
