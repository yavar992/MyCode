package oops.a.oops5;

interface a {
    default  void show(){
        System.out.println("default a");
    }
    abstract void hey();
    static void greet(){
        System.out.println("hello!");
    }
}
interface b{
    default void show(){
        System.out.println("default b");
    }
}
class c implements a,b{

    @Override
    public void show() {
        a.super.show();
        b.super.show();
    }
    public void defaulta_a(){
        a.super.show();
    }
    public void defalt_b(){
        b.super.show();
    }
    public void hey(){
        System.out.println("hey!");
    }

    public static void main(String[] args) {
        c test = new c();
        test.show();
        test.defaulta_a();
        test.defalt_b();
        a.greet();
        test.hey();
    }
}

