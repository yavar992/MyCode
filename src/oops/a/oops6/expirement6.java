package oops.a.oops6;

public interface expirement6 {
    void display(String name);
}

class lemdaexample6{
    public static void main(String[] args) {

        expirement6 exp6 = (name -> System.out.println("yavar"));
        System.out.println(exp6.toString());

    }
}
