package oopspractice.importstatement;

public class imp1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.show();

    }
}
class student{
    String name;
    int roll_no;
    float marks;
    int class_no;
    public student(String name, int roll_no, float marks, int class_no) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
        this.class_no = class_no;
    }
    student(){
        this.name = "yavar ali khan";
    }
    void show(){
        System.out.println(this.name + " is making noise");
    }
    void random(){
        System.out.println("we r humans");
    }
void hello(){
    System.out.println("hello everyone");
}
}
