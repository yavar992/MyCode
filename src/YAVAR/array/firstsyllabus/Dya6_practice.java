package YAVAR.array.firstsyllabus;

import java.util.Scanner;

public class Dya6_practice {
    public static void main(String[] args) {
//    int gr =   greatest(12,32,34);
//        System.out.println(gr + " is greatest");
//       int min = minimum(32,12,43);
//        System.out.println(min + " is minimum");
//        even_odd(32);
        //  check(11);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter firs digit");
//        int a = sc.nextInt();
//        System.out.println("enter second digit");
//        int b = sc.nextInt();
//       int c = sum(a,b);
//        System.out.println("the sum is" +c);
//        area(5);
//       int no= factorial(5);
//        System.out.println(no);
//        boolean pal =palindrome(15351);
//        System.out.println(pal);
//      boolean ch =   pythagarous(5,4,3);
//        System.out.println(ch);
//        prime(21);
   // }

        //Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
//    static int greatest(int a , int b , int c){
//        int max = a;
//        if (b>a){
//            max = b;
//        }
//        if (c>a){
//            max = c;
//        }
//        return max;
//    }
//    static int minimum(int a , int b , int c){
//        int min = a;
//        if (b<a){
//            min = b;
//        }
//        if (c<b){
//            min = c;
//        }
//        return min;
//    }
//    //Define a program to find out whether a given number is even or odd.
//    static void even_odd(int a ){
//        if(a%2==0){
//            System.out.println(a+ " is even");
//        }
//        else
//            System.out.println(a+" is odd");
//    }
        //A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.


        //Write a program to print the sum of two numbers entered by user by defining your own method.
        // static int sum(int a , int b){
        // return a+b;


        //Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
//   static void area(int radius){
//        double pi =3.14;
//        double circum = 2*pi*radius;
//       System.out.println("the circumference of a circle is " + circum);
//        double area = pi*radius*radius;
//       System.out.println("the area of a circle is " + area);
//
//   }
//   //Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//
//    static int factorial(int num){
//        int temp = 1;
//        for (int i=num; i>1; i--){
//            temp = temp*i;
//        }
//        return temp;
//    }
        //Write a function to find if a number is a palindrome or not. Take number as parameter.
//    static boolean palindrome(int no){
//        int answer =0;
//        int original =no;
//        while(no>0){
//            int rem = no%10;
//            no = no/10;
//            answer = answer*10+rem;
//
//        }
//        if (original==answer){
//            return true;
//        }
//        return false;
//    }
        //Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
//    static boolean pythagarous(int a , int b , int c){
//        if (a * a == (b * b) + (c * c)){
//            return true;
//        }
//        return false;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input");
        int ss = sc.nextInt();
       int nn =  naturalnumer(ss);
        System.out.println(nn);
    }
//    //Write a function that returns all prime numbers between two given numbers.
//        static void prime( int num){
//            int count = 2;
//            int temp = 0;
//            for (int i = 2; i <= num; i++) {
//                if (num % 2 == 0) {
//                    temp = temp + 1;
//                }
//
//            }
//            if (temp > 1) {
//                System.out.println("not prime");
//            }
//            if (temp == 1) {
//                System.out.println("prime");
//            }
//        }
    /// sum of first n natural number
    static int naturalnumer(int no){
        int temp =0;
        for (int i=1;i<=no; i++){
            temp = temp+i;
        }
        return temp;
    }
    }

