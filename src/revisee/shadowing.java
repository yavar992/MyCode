package revisee;

import java.util.Arrays;

public class shadowing {
    static int c  = 23;

    public static void main(String[] args) {
        System.out.println(c);
        int c = 34;
        System.out.println(c);
        sum();
        sum(2,3,3,3,4,4,5,6,6,7);
        ran(3,5,"yavar");
    }
    static void sum(){
        System.out.println(c);
    }

    // variable no of arguments
    static void sum(int...a){
        System.out.println(Arrays.toString(a));
    }
    static void ran(int a , int v , String name){
        System.out.println(a
        );
    }
}
