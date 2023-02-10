package oops.a.oops3.multilevel_inheritence;


public class person { // super class
   String getname(){
       return "yavar ali khan";
   }
}
class programmer extends person{
     String coding_language(){
         return "java";
     }
}
class programm extends programmer {
    int lineofcode() {
        return 20;
    }


    public static void main(String[] args) {
programm p1 = new programm();
        System.out.println(p1.getname() + " writre " + p1.lineofcode() + " line of code in " + p1.coding_language());
    }
}

