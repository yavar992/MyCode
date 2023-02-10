package oops.a.inheritence;

public class singleton {
    private singleton(){

    }
    private static singleton instance;

    public static singleton getinstance() {
        if (instance==null){
            instance =new singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        hello a  = new hello(32);
        System.out.println(a.a);
    }
}
