package oops.a.oops_question;
//Can we pass this keyword as argument in a method call?
// answer - The this keyword can also be passed as an argument in the method. It is mainly used in the event handling

public class four {
    int age;
    String name;
    float no;

    four(){

    }

    public four(int age, String name, float no) {
        this.age = age;
        this.name = name;
        this.no = no;
    }
    void main(four obj){
        System.out.println("hello");
    }
    void p(){
        main(this);
    }

    public static void main(String[] args) {
        four abc = new four();
        abc.p();
    }
}
