package oops.a.oops6;

import java.util.ArrayList;

public class arrrayist {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>(5);
        int n =5;
        for (int i = 1; i <=n ; i++) {
            list1.add(i);
        }
        System.out.println(list1);
        list1.add(33);
        list1.add(123);
        list1.add(23);
        System.out.println(list1);
        list1.add(0,12);
        System.out.println(list1);
       /// list1.clear();
        System.out.println(list1);
        list1.hashCode();
        System.out.println(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
    }
}
