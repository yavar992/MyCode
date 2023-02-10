package oops.a.oops_question;
//Can we override a private or static method in Java?
// ANSWER - it will not override because as we know that runtime polymorphism happens at runtime and static method or any static stuff
// does not depend on object so if we try to overide our static method it will an error
// we can ourride our stai=
public class third {
    static void hey(){
        System.out.println("hello");
    }
}
class thirdquestion extends third{
  ///@Override
    static void hey(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        thirdquestion a = new thirdquestion();
             thirdquestion.hey();
             third.hey();
    }
}
