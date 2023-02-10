package oops.practice;

import java.util.Objects;

public class check {
 int s =10;
 String V = "DW";
   static class a{
       static int a = 10;
    }

    public static void main(String[] args) {
        a ab = new a();
        int d = ab.a;
        System.out.println(d);
        System.out.println(a.a);
    }
}
class s{
    int a;

    public s(int a) {
        this.a = a;
    }

    static int b = 20;
    void m1(){
        b= 3;
    }
    static void m2(){
      //  a = 21;
        b = 32;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        s s = (s) o;
        return a == s.a;
    }

    @Override
    public int hashCode() {

        return Objects.hash(a);
    }

    public static void main(String[] args) {
        s a = new s(314);
        s b = a;
        s bs = new s(234);
        System.out.println(a instanceof s);
        System.out.println(a.hashCode());
        System.out.println(bs.hashCode());
        String name1 = "yavar";
        String name2 = "yavar";
        String name4 = "yavar ali khan";
        System.out.println(name1==name4);
        String name3 = new String("yavar");
        System.out.println(name1.equals(name4));
        System.out.println(name1==name2);
        System.out.println(name1==name3);
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
 }
}
