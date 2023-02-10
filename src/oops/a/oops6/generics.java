package oops.a.oops6;
import java.util.*;
public class generics {
    public static void main(String[] args) {
      ArrayList list = new ArrayList();
      list.add("hey");
      list.add(12);
      list.add(43);
      list.add(32);
      int a =(int) list.get(0);
        System.out.println(a);
    }
}
