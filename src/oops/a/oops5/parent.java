package oops.a.oops5;

abstract public class parent {
    // we cannot make the object of abstract class why ? because if we do so then if we access the abstract method of abstract class then method should have implementation
    // but abstract class sayes that you cannot implement the abstrct method
   abstract void carrear();
    abstract void partner();
    // can we make abstract constructor -- wo we cannot because we cannot make the object of abstract class ,
    //so if we do crete the abstract constructor then we need to create the object of abstract clas as well,
    // can we make abstract static method ? - no why because abstract method do override in child class but static method cannot be override
   final void normal(){
        System.out.println("this is a normal method");
    }
}
class son extends parent{

    @Override
    void carrear() {
        System.out.println("i will be a coder");
    }



    @Override
    void partner() {
        System.out.println("i love wonderwoman");
    }
}
class dauhter extends parent{

    @Override
    void carrear() {
        System.out.println("i will be a doctor");
    }

    @Override
    void partner() {
        System.out.println(" i love ironman");
    }

    public static void main(String[] args) {
        son rahul = new son();
        rahul.carrear();
        rahul.partner();

        dauhter meera = new dauhter();
        parent ab = new dauhter();
        ab.carrear();
        meera.carrear();
        meera.partner();
        meera.normal();
    }
}
