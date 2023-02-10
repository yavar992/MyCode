package oops.practice;

public class checking_override_method {
  static void display(){ // cannot usee subclass if suoerclass is static or private
        System.out.println("super class");
    }



    public static void main(String[] args) {
        checking_override_method a  = new checking_override_method();
        a.display();
        checking_override_method.display();
    }
}

class abc {
    String name = "yavar";
  static   void displayname(String name){
        System.out.println("my name is " + name);
    }
   class ab extends abc{
        void display(String name){
            System.out.println("my name is this " + name);
        }
   }

    public static void main(String[] args) {
        abc a = new abc();
        a.name = "yavar";
        a.displayname("yavar ali khan");
        abc d = new abc();
        d.displayname("yavar");
        abc.displayname("me");
    }
}

