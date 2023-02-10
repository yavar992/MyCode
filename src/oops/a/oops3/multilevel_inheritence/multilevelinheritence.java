package oops.a.oops3.multilevel_inheritence;

public class multilevelinheritence {
   private int l;
    int b;
    int w;

    public multilevelinheritence(int l, int b, int w) {
        this.l = l;
        this.b = b;
        this.w = w;
    }
  static private void greet(){
        System.out.println("hello");
    }
    protected static void fun(){
        System.out.println("have some fun");
    }

    public static void main(String[] args) {
fun();
greet();
    }
}
