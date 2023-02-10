package oops.a.oops3.polymorphism;

public class static_overriding {
    static void greet(){
        System.out.println("hello");
    }
}
class p2 extends static_overriding{
    static void greet(String name){
        System.out.println(" hello "+ name);
    }

    class p3 extends static_overriding{
        static void greet(){
            System.out.println("have fun");
        }
    }

    public static void main(String[] args) {
        p2 p1 = new p2();
        p2.greet("yavar");
        static_overriding.greet();
        p3.greet();
        System.out.println("e- learing" + 100 + 100);
        System.out.println('e'+'r');
    }
}

