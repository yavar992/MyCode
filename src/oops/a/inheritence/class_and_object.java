package oops.a.inheritence;

public class class_and_object {

        public static void main(String[] args) {
            Bird cock = new Bird();
            cock.flying();
            cock.eating();
            cock.eyes = 2;
            cock.ear =2;
            cock.name = "cock";
            System.out.println(cock.ear);
            System.out.println(cock.eyes);
            System.out.println(cock.name);

            Animal lion = new Animal();
            lion.running();
            Employee e1 = new Employee("yavar",10234);
            System.out.println(e1.employee_id + " " + e1.name);
            player pyaler1 = new player("virat kohli" , 18);
            System.out.println("name is " +pyaler1.name + "and jersey no is "  + pyaler1.jersey_num);
            player player2 = new player();
            System.out.println(player2.name +" " + player2.jersey_num);
            // final keyword
//            A yavar = new A("yavar");
//            yavar.name = "ali khan";
//            System.out.println(yavar.name);
            // but i cannot do like
            /*
            yavar.name = new(A);

             */
            A obj;
//            for (int i = 1; i <11 ; i++) {
//                new A("yavar");
//            }
         test t1 = new test();
            t1.setvalue(10);
            t1.shos();
            System.out.println();
            Bird Sparrow = new Bird();
            Sparrow.flying();

        }
    }
class Bird{
    int eyes = 2;
    String  name = "peacock";
    int ear = 2;
   void flying(){
        System.out.println("i am flying");

        }
        void eating(){
            System.out.println
                    ("i am eatibg");
        }

    }
class Animal{
    void running(){

        System.out.println("i am running");
    }

}
class Employee{
    String name;
    int employee_id;
    Employee(String nameofemployee , int employeeofid){
        this.name = nameofemployee;
        this.employee_id = employeeofid;
    }
}
class player {
    String name;
    int jersey_num;

    player(String name, int jersey_num) {
        this.jersey_num = jersey_num;
        this.name = name;

    }

    player() {
        this("DHONI", 7);

    }
}
class A{
    final int no = 10;
    String name;
    A(String name){
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}

class test{
    int i;
    void setvalue(int x){
        this.i = x;
    }
    void shos(){
        System.out.println(i);
    }

}

