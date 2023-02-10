package oops.a.inheritence;

public class oops2 {
    public static void main(String[] args) {
        System.out.println("hello wolrd");
        players p1 = new players();
        p1.fun();
        greeting("hello");
    }
    void greeting(){
        System.out.println("yavar");
    }
    static void greeting(String greet){
        System.out.println(greet);
    }
}
class players{
    int n;
   void fun(){
        System.out.println("player do fun");
    }
}
