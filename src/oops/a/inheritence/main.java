package oops.a.inheritence;

public class main {
    public static void main(String[] args) {
        human yavar = new human(19 , "yavar ali khan" ,4000 ,false);
        System.out.println(human.population);
        human anas = new human(18,"anas",3000,false);
        System.out.println(human.population);
        human.messeege();
        fun();

    }

    static void fun(){
        main obj = new main();
        obj.greeting();
    }
    void fun2(){
        greeting();
    }
   void greeting(){
        System.out.println("hello world");
    }
}
