package Advanced_java.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class comparable_and_comparator {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(23);
        list1.add(12);
        list1.add(65);
        list1.add(75);
        list1.add(6);
        list1.add(32);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
