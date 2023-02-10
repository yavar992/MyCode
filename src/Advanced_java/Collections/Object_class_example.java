package Advanced_java.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Object_class_example {
    public static void main(String[] args) {

        ArrayList<a> list2 = new ArrayList<>();
        list2.add(new a(12,"rahul","delhi"));
        list2.add(new a(4,"sonu","hyrdabad"));
        list2.add(new a(34,"mohit","cheenai"));
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
    }
}
