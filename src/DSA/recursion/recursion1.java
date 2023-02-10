package DSA.recursion;

public class recursion1 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        // base condition
        if (n==5){
            System.out.println(5);
            return;
        }
            System.out.println(n);
            print(n+1); //  recursive call
        // if you are calling a method again and again we can treat it as aseperate call in the stack memory
    }

}
