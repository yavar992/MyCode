package Advanced_java.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.lang.System;

public class list {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("rahul");
        names.add("shivam");
        names.add("peatap");
        names.add("kadir");
        names.add("anas");
        names.add("aasu");
        System.out.println(names);
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("sonu");
        names2.add("monu");
        names2.add("mukesh");
        names2.add("dj");
        names2.add("bravo");
        System.out.println(names2);
        ArrayList<String> names1 = new ArrayList<>();

       names.addAll(names1);
       names.add("rhitik");
       names.add("salman");
       names.add("shahrukh");
        System.out.println(names);
      String indexof =  names.get(4);
        System.out.println("element at searched index is "+indexof);
       names.clone();
       names.add(3,"david");
        System.out.println(names);
        names.remove(4);
//        System.out.println(names);
//        names.remove(String.valueOf("shivam"));
//        System.out.println(names);
//

        for(String element: names){
            String name = "hey";
            System.out.println(name + " " +element);
        }
    }
}
