package oops.a.oops3.multilevel_inheritence;

import javax.print.DocFlavor;

public class iphone_feaure {
    void call(){
        System.out.println("iphone 6 have calling feature");
    }
    static void greet(){
        System.out.println(" i am in iphone feature");
    }
}
class iphone10 extends iphone_feaure{
    void faceif(){

        System.out.println("iphone 10 has feature of unlocking phone by face id");
    }
    static void greet(){
        System.out.println("hey i am in iphone 10");
    }
}
class iphone12 extends iphone10{
    void fice_G(){

        System.out.println("iphone 12 have 5g network");
    }
    static void greet(){
        System.out.println("i am in iphone 12");
    }

    public static void main(String[] args) {
        iphone12 blue = new iphone12();
        blue.fice_G();
        blue.call();
        blue.faceif();
        iphone_feaure.greet();
        blue.greet();



    }
}
