package oops.a.oops5;

public interface interface_b {
    /*
    Prior to JDK 8, the interface could not define the implementation. We can now add default implementation for interface methods. This default implementation has a special use and does not affect the intention behind interfaces.
     */
    final int a = 12;
    void display();
}
class acess implements interface_b{
    @Override
    public void display() {
        System.out.println("content");
    }

    public static void main(String[] args) {
        acess ab = new acess();
        ab.display();
        System.out.println(a);
    }
}
interface vehicle{
    void changegear(int gear);
    void speedup(int speed);
    void applybrake(int brake);
}
class bycycle implements vehicle{
      int gear;
      int speed;
    @Override
    public void changegear(int newgear) {
           gear = newgear;
    }

    @Override
    public void speedup(int increment) {
         speed = speed+increment;
    }

    @Override
    public void applybrake(int decrement) {
          speed = speed-decrement;
    }

    public void printstate(){
        System.out.println("gear:" + gear + "speed :" + speed);
    }
    public static void main(String[] args) {
        bycycle atlas = new bycycle();
        atlas.changegear(3);
        atlas.speedup(20);
        atlas.changegear(20);
        atlas.printstate();
    }
}
// one interfaces can extend the other iterfaces
interface ab {
    void show1();
    void show2();
}
interface ab1 extends ab{
    void show3();
}
class ab2 implements ab1{

    @Override
    public void show1() {
        System.out.println("hey!");
    }

    @Override
    public void show2() {
        System.out.println("hello!");
    }

    @Override
    public void show3() {
        System.out.println("how r u ?");
    }

    public static void main(String[] args) {
        ab2 ab = new ab2();
        ab.show1();
        ab.show2();
        ab.show3();
    }
}
interface abc{
    void display();
}
interface abcd{
    void display();
}
class abcde implements abc ,abcd{

    @Override
    public void display() {
        System.out.println("heyyy");
    }
}
