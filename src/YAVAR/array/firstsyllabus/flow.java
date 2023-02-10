package YAVAR.array.firstsyllabus;

import java.util.Scanner;
public class flow {
    public static void main(String[] args) {
        int  aa =131;
        byte ba = (byte)(aa);
        System.out.println(aa);
        System.out.println(ba);
        // reverse a sring
        String str= "yavar ali khan";
        String reverse = "";
        for (int i = str.length()-1; i>=0 ; i--) {
            reverse +=str.charAt(i);
        }
        System.out.println(reverse);
//        Scanner pr = new Scanner(System.in);
//        System.out.println("enter number");
//        int prime = pr.nextInt();
//        if((prime<=1)){
//            System.out.println("not prime nor composite");
//        }
//        int c = 2;
//        while(c*c<prime){
//            if (prime%c==0){
//                System.out.println("number is not prime");
//            }
//            c++;
//        }
//        System.out.println("number is prime");
//
//
////CHECK if input year is leap or not
//
//
//              Scanner sc = new Scanner(System.in);
//        System.out.println("enter year");
//        int year = sc.nextInt();
//
//        if(year%400==0){
//            System.out.println("leap year");
//        } else if (year%100==0) {
//            System.out.println("non-leap year");
//        } else if (year%4==0) {
//            System.out.println("leap year");
//        }
//        else{
//            System.out.println("non-leap year");
//        }
//
//        // print a table input by the user
//
//        Scanner tb = new Scanner(System.in);
//        System.out.println("enter number");
//        int table = tb.nextInt();
//
//        int i= 1;
//        while (i<=10){
//            int sum = table*i;
//            System.out.println(sum);
//            i++;
//        }
        // find lcm and hcf of aany number
//        Scanner hc = new Scanner(System.in);
//        int num1 = hc.nextInt();
//        int num2 = hc.nextInt();
//        int gcd = 1;
//        for (int d=1; d<=num1; d++){
//            if((num1%d==0) && (num2%d==0)){
//                gcd =d;
//            }
//            System.out.println(gcd);
//
//
//        }
        int f =12;
        int g = 16;
        int gcd = 1;
        for (int i=1; i<=g && i<=f; i++){
            if((f%i==0) && (g%i==0)){
                gcd=i;
                System.out.println(gcd);
            }
        }
        int lcm = g*f/gcd;
        System.out.println(lcm);

        Scanner out = new Scanner(System.in);
        System.out.println("enter number");
        int num1 = out.nextInt();
        int num2 = out.nextInt();
        int hcff= 1;

        for (int a=1; a<=num1 && a<=num2; a++){
            if(num1%a==0 && num2%a==0){
                hcff = a;
            }
        }
        int lcmm = num1*num2/hcff;
        System.out.println("hcf is " + hcff + "and lcm is "+ lcmm);

        //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        Scanner ch = new Scanner(System.in);
        System.out.println("enter alphabat");
        char alpha = ch.next().charAt(0);
        //while()
        System.out.println(alpha);
    }

    }


