package oops.a.oops3.polymorphism;

public class  bike
{
    String bikename;
void averagespeed(){
    System.out.println("average speeed of bikes is 100km/s");
}
void fun(){
    System.out.println("have fun");
}
}
class apachi extends bike{
    String bike_model;
    void averagespeed(){
        System.out.println("average speed of apachi is 120km/s");
    }
    void greet(){
        System.out.println("asslamvaleyikum");
    }

class ktm extends bike {
    @Override
    void averagespeed() {
        System.out.println("avrage speed of ktm is 150km/s");
    }


}
    public static void main(String[] args) {
       bike b1 = new bike();
       b1.averagespeed();
       b1.fun();
       b1.bikename = "bullet";
       apachi a1 = new apachi();
       a1.bikename = "superbike";
       a1.averagespeed();
       a1.bikename = "aachi";
       a1.bike_model = "first model";
       a1.greet();

          }
}
