package oops.practicerevise;
public class calling_A_constructor_from_another_constructor {
    int x;
    String name;
    int marks;

    public calling_A_constructor_from_another_constructor(int x, String name , int marks) {
        this.x = x;
        this.name = name;
        this.marks = marks;
    }
    calling_A_constructor_from_another_constructor(int x , String name){
        this.x = x;
        this.name = name;
    }
    calling_A_constructor_from_another_constructor(){
        System.out.println("this is defult consrtructor");
    }
    calling_A_constructor_from_another_constructor(int x , int marks){
        this(4,"hey",31);
        this.x = x;
        this.marks = marks;

    }

    public static void main(String[] args) {
        calling_A_constructor_from_another_constructor a1 = new calling_A_constructor_from_another_constructor();
        System.out.println(a1.x);
        System.out.println(a1.name);
    }
}
