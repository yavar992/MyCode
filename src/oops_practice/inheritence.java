package oops_practice;

public class inheritence {
    int id;
    String name;
    String state;
    float marks;

    void dancing(){
        System.out.println("samar is dancing");
    }
    inheritence(){

    }

    public inheritence(int id, String name, String state, float marks) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.marks = marks;
    }

    static void hello(){
        System.out.println("hello i'm in inheritece example");
    }
    void detailofperosn(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("the name of id no " + this.id + " is " + this.name);
    }

    public static void main(String[] args) {
        inheritence inh = new inheritence();
        inh.detailofperosn(4,"samar");

    }
}
