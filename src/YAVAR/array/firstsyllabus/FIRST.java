package YAVAR.array.firstsyllabus;
import java.util.Scanner;


public class FIRST {
    public static void main(String[] args) {
//        System.out.println("hi");
//        int a = 23_00_00;
//        System.out.println(a);
        // casting -- when we assign a data type toanother data type clled casting
        //casting r of two type ---1/ widening (automatically) when we convert smaller data type to biggdr data type
        // narrowing (manually)--when we convert bigger data type to smaller data type
//        int s = 12;
//        float c =s;
//        System.out.println(c);
//        //narrowing
//        double d = 23.4422;
//        int f = (int) d;
       // System.out.println(f);
        //automatic type promotion in java
//        int ab = 257;
//        byte bb = (byte) ab;
//        System.out.println(bb);
////
//       byte ab = 127;
//       byte ss = 22;
//       int sd = ab-ss;
////        System.out.println(sd);
////
//        byte s = 12;
//        byte d =  (int) +12;
//        int g =  (d*s);
//        System.out.println("nín hǎo  नमस्ते");
//        int num = 'C';
//        System.out.println(num);
//     //TYPE CONVERSION RULE
//        // IF WE ARE USING ARITHMATIC CALCULATION B/W DIFF DATA TYP THEN WE GET THE RESULT IN BIGGER DAT TYPE
//        // Int * char = int
//        //float * int = float;
//        //double * short = double ;
//        int ii = 12;
//        char cc = 'A';
//        short ss = 123;
//        float ff =23.434f;
//        double dd = 23.432423;
//        long ll = 1213223323l;
//        double sum =  (ii*cc) + (ss*ff)-  (dd*ff)+ (ii*ll);
//        System.out.println((ii*cc) + "  " + (ss*ff) +  " " + (dd*ff)+ " " + (ii*ll));
//        System.out.println(sum);

int num = 11;
int count = 2;
int temp = 0;
        if (num<=1){
            System.out.println("nor p nor c");
while(count*count<num){
    if (num%count==0){
        System.out.println("prime");
    } else {
        System.out.println("not prime");
    }
    count++;

}

}
    }
}
