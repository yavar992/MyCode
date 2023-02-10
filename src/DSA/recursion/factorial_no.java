package DSA.recursion;

public class factorial_no {
    public static void main(String[] args) {
       int a = factorial(5);
        System.out.println(a);
    }
    static int factorial(int n){
       if (n==1){
           return 1;
       }
       return n*factorial(n-1);
    }
}

