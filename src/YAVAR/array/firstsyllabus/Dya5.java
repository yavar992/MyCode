package YAVAR.array.firstsyllabus;
import java.util.Scanner;
public class Dya5 {
//    static char check(char ch) {
//        if (ch >= 'a' || ch >= 'z')
//            System.out.println(ch + " is lowercase");
//        else if (ch >= 'A' || ch >= 'Z')
//            System.out.println(ch + " is upparcase");
//        else
//            System.out.println("invalid character");
//
//        return ch;
//    }
//
//    public static void main(String[] args) {
//        char ch = 'F';
//        check(ch);
//    }
//    static int reverse(int no){
//        int res= 0;
//        for (int i = 1; i<=no; i++){
//            int rem = no%10;
//            res = res*10+rem;
//            no = no/10;
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number");
//        int number = sc.nextInt();
//       int a = reverse(number);
//        System.out.println(a);
//
//    }
//
//

// count the occutance of number
//    static long ocurance(long no){
//        int temp=0;
//        while(no>0){
//            long rem = no%10;
//            if (rem==5){
//                temp = temp+1;
//            }
//            no = no/10;
//        }
//        return temp;
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter input");
//        long number = sc.nextLong();
//       long n = ocurance(number);
//        System.out.println(n);
//    }

    // shadowing
//    static int x  =56; // low level scope
//
//        public static void main(String[] args) {
//            System.out.println(x);
//            int x = 23; // high level scope
//            System.out.println(x);
//
//            fun();
//
//        }
//        static void fun(){
//            System.out.println(x);
//        }
        // variable arguments
//    public static void main(String[] args) {
//        fun(1,2,3,3,4,5);
//        multiple(1,2,'a','b','c');
//    }
//
//    static void multiple(int a, int b, char...d) {
//        System.out.println(Arrays.toString(d));
//    }
//
//    static void fun(int ...v){
//        System.out.println(Arrays.toString(v));
//    }

    // function overloading
//    public static void main(String[] args) {
//      int i =   sum(3,4);
//        System.out.println("first");
//        System.out.println(i);
//    int j =  sum(3,4,5);
//        System.out.println("second");
//        System.out.println(j);
//     String naam =   name("yavar ali khan");
//        System.out.println(naam);
//    }
//
//    static int sum(int  a , int b){
//        return a+b;
//    }
//    static String name(String name){
//        return name;
//    }
//    static int sum(int a , int b, int c){
//        return a+b+c;
//    }

    // make a method to check whether the number is prime or not
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter input");
//        int a = sc.nextInt();
//    boolean f=    isprime(a);
//        System.out.println(f);
//


//    static boolean isprime(int num){
//        if (num<=1){
//            return false;
//        }
//        int count = 2;
//        int temp=0;
//        for (int i=count; i<=num; i++){
//            if (num%i==0){
//                temp = temp+1;
//            }
//        }
//        if (temp>1){
//            return false;
//        }
//        else{
//            return true;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(armstrong(153));
//        for (int i=100; i<1000; i++){
//            if (armstrong(i)){
//                System.out.println(i);
//            }
//        }
//    }
//    static boolean armstrong(int n){
//        int original = n;
//        int sum =0;
//
//        while (n>0){
//            int rem = n%10;
//            n = n/10;
//            sum = sum+rem*rem*rem;
//        }
//        if (sum==original){
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//
//    }
//    static int problem(int no){
//        while(no>0){
//            int frist = no%10;
//            no = no/10;
//            return frist;
//
//        }
    //}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("first");
//        int first = sc.nextInt();
//        System.out.println("second");
//        int second = sc.nextInt();
//       boolean ab = isprime(12);
//        for (int i=first; i<=second; i++){
//            if (isprime(i)){
//                System.out.println(i);
//            }
//        }
//    }
//Write a function that returns all prime numbers between two given numbers.
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("firsrt");
    int num1 = sc.nextInt();
    System.out.println("second");
    int num2 = sc.nextInt();
  boolean s =  isprime(89);
    System.out.println(s);
    for (int i =num1; i<=num2; i++){
        if (isprime(i)){
            System.out.println(i);
        }
    }
}
    static boolean isprime(int no){
        int temp =0;
    if (no<=1){
            return false;
        }
        for (int i=2; i<=no; i++){
            if (no%i==0){
                temp = temp+1;
            }
            if (temp>1){
                return false;
            }
        }
        return true;

    }
}

