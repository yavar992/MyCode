package oops.a.Exception_Handling;

public class throws_and_throw {
   static void method1()throws NullPointerException{
        System.out.println("this method throw Null-pointer exception");
        throw  new NullPointerException();
    }
   static void method2() throws ArithmeticException{
        System.out.println("this method throw arithmetic exception");
        throw new ArithmeticException();
    }

    public static void main(String[] args) {
        try{
            method1();
        }catch (Exception e){
            System.out.println("exception is " + e);
        }
        try{
            method2();
        }catch (Exception e){
            System.out.println("exception is" + e);
        }
    }
}
