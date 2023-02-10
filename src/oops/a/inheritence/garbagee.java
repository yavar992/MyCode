package oops.a.inheritence;
import java.util.Scanner;

public class garbagee {
    public static void main(String[] args) {
        // 1 data type
//
//        int a = 10;
//        short as = 23132;
//        System.out.println(as);
//        double ss = 174348.87699d;
//        System.out.println(ss);
//        String name = "yavar";
//        char aa = 'a';
//        float ds = 12.11f;
//        byte s = 65;
//        byte d = 9;
//        System.out.println(a*d);
//        int ass = 20;
//        int df = 22;
//        byte e = (byte) (ass*df);
//        System.out.println(e);
//        System.out.println(22*20%256);
//        byte q = 20;
//        byte w =22;
//        int l = q*w;
//        System.out.println(q*w);

        // how to take input from user
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the first  digit here");
//        int fdig = sc.nextInt();
//        System.out.println("enter second digit here");
//        int secdig = sc.nextInt();
//        int sum = fdig+secdig;
//        System.out.println("the sum is " + sum);

        /// make a progtamm tht takes char as a input nd return whether it is upparcase or lowercase
//        System.out.println("enter th character here");
//        char ch = sc.next().charAt(0);
//
//        if ((ch>='a')&&(ch<='z')){
//            System.out.println("lowercase");
//        } else if ((ch>='A')&& (ch<'Z')) {
//            System.out.println("upparcase");
//        }
        // PRINT THE TABLE OF ANY NUM
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int s  = sc.nextInt();
//        for (int i=1; i<=10; i++){
//            int d = i*s;
//            System.out.println(d + " ");
//        }
        // find the factorial of given number
        int fac =1;
        for (int i=s; i>0; i--){
            int sum =1;
            fac = fac*i;
        }
        System.out.println(fac);
   }




}
