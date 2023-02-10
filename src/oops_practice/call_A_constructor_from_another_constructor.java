package oops_practice;

public class call_A_constructor_from_another_constructor {
    int a;
    String name;

    public call_A_constructor_from_another_constructor(int a, String name) {
        this.a = a;
        this.name = name;
    }

    call_A_constructor_from_another_constructor(){
        this(3,"yavar");
    }

    @Override
    public String toString() {
        return a + " " + name;
    }
}
