package oops.a.oops5;

public class multiple_inherit implements multiple_inheritence,second_interface{

    @Override
    public void print() {
        System.out.println("i am method of multiple inheritnce");
    }

    @Override
    public void show() {
        System.out.println("i am method of second inheritence");
    }

    public static void main(String[] args) {
        multiple_inherit a = new multiple_inherit();
        a.print();
        a.show();
        System.out.println(b);
    }
}
