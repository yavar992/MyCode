package oops.a.oops6;

import java.util.Arrays;

public class acess_genereclass {
    public static void main(String[] args) {
        MygenericClass<Integer> t1 = new MygenericClass<>(12);
        t1.add(13);
        t1.add(34);
        t1.add(43);
        t1.add(54);
        int n = t1.get(2);
        System.out.println(t1);
        System.out.println(n);

        MygenericClass<String> t2 = new MygenericClass<>("hello");
        t2.get("hey!");
        t2.add("334");
        t2.add("shut up!");
        String n1 =  t2.get(String.valueOf(1));
        System.out.println(n1);
        System.out.println(t2);
        t2.show("hey");

        
    }
}
