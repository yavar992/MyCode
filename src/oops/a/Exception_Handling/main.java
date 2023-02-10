package oops.a.Exception_Handling;

public class main {


    public static void main(String[] args) {
        int a =5;
        int b = 0;
        try {
           // divide(5,0);
            String name = "yavar";
            if (name.equals("yavar")){
                throw new myexception("my exception is working fine");
            }
            throw new Exception("just for fum");
        }
        catch (myexception e){
            System.out.println(e.getMessage());
        }
        catch (Exception B){
            System.out.println("this is normal exception");
        }
        finally {
            System.out.println("this willl always executed");
        }

    }
    static  int divide(int a , int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("do not divide b 0");
        }

        return a/b;
    }

}
