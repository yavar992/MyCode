package oops.a.inheritence;

public class staticblock {
    static int a =4;
    static int b;
    static {
        System.out.println("i am in staic block");
        b= a*5;
        System.out.println(b);
    }

    public static void main(String[] args) {
        staticblock obj1 = new staticblock();
        System.out.println(staticblock.a + " " + staticblock.b);
        staticblock.b+=3;
        System.out.println(staticblock.a + " " + staticblock.b);
        staticblock obj2 = new staticblock();
    }
}
