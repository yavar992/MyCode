package YAVAR.array.firstsyllabus;
import javax.swing.*;
import java.util.Scanner;

public class day1 {
    int no;

    public day1(int no, String name, int marks) {
        this.no = no;
        this.name = name;
        this.marks = marks;
    }

    String name;
    int marks;

    void name(){
        System.out.println("hello everyone");
    }
    public static void main(String[] args) {
//        int i=0;
//while(i!=4){
//    System.out.println(i);
//    i++;
//}
////for loop
//        for (int i = 1; i < 4; i++) {
//            System.out.println(i);
//        }
//        //convert celcuis into fahrenhite
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter temperature here in c");
//        float c = in.nextFloat();
//        float f = (c * 9/5) + 32;
//        System.out.println(f);
// conditional statement
//         int salary = 12344;
//         if(salary>1000){
//             salary+=2000;
//         } else if (salary<11000) {
//             salary+=2500;
//         }
//         else{
//             salary+=500;
//         }
//        System.out.println(salary);
//
         /*FOR LOOPS
        for (){
        body
        }
        */
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter number");
//        int as = in.nextInt();
//        for (int s =1; s<=as; s++){
//            System.out.println("hello wold");
//        }
        /*
        initialization
        while(contion){
        body
        increment
        }

//         */
//        Scanner no;
//        no = new Scanner(System.in);
//        System.out.println("enter number");
//        int ae;
//        ae = no.nextInt();
//
//        int i;
//        i = 1;
//        while (i<=ae){
//            System.out.println(i);
//            i++;
//        }
        /*
        initialization
        do while
        do{
        code
        increment
        }
        while(condition)
         */
//        int i = 7;
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<7);

//        //take three input snd check which one is greatest
//         Scanner input = new Scanner(System.in);
//        System.out.println("enter number");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
////
//        int max = a;
//        if (b>max){
//            max = b;
//        }
//        if (c>max){
//            max=c;
//        }
//        System.out.println( "the maximum number is " + max);
//        int max = Math.max(c,Math.max(a,b));
//        System.out.println(max);

        // write a programm that takes alphabat from user and output if alphabat is upparcase or lowercase
//        Scanner alp = new Scanner(System.in);
//        System.out.println("write alphabat here");
//        char ch = alp.next().charAt(0);
//
//        if (ch>='a' && ch<='z'){
//            System.out.println("lowercase");
//        }
//       else {
//            System.out.println("upparcase");
////        }
        /// sum of first 7 number
//        int a = 7;
//        int rn = 0;
//        for (int i = 0; i <= a; i++) {
//            rn = rn + i;
//            System.out.println(rn);
//        }
//// factorial of 5
//int an = 5;
//int fc = 1;
//for (int i = an; i>0; i--){
//    fc = fc*i;
//    System.out.println(fc);
//}
//fibonacci number
//Scanner in = new Scanner(System.in);
//        System.out.println();
//        int inp = in.nextInt();
//        int a= 0;
//        int b = 1;
//        int count = 2;
//
//        while(count<=inp){
//            int temp;
//            temp = b;
//            b = b+a;
//            a=temp;
//            count++;
//        }
//        System.out.println(b);
// count occurance of digit in a number..
//        long num = 4843654454344l;
//        int count = 0;
//        while (num > 0) {
//            long rem = num % 10;
//
//            if (rem == 4) {
//                count++;
//            }
//            num = num / 10;
//        }
//        System.out.println(count);

//
//long number = 73093873l;
//int coun = 0;
//while (number>0){
//   long remainder =  number%10;
//   if (remainder==3){
//       coun++;
//   }
//   number = number/10;
//}
//        System.out.println(coun);

//    String str = "mynameisyavarlikhan";
//    char ch = 'a';
//    int count = 0;
//    for (int i=1; i<str.length(); i++){
//        if (str.charAt(i)==ch){
//            count++;
//        }
//    }
//        System.out.println(count);
//
//
//    long numm = 38398398303l;
//    int countt = 0;
//    while(numm>0){
//        long remmm = numm%10;
//        if (remmm==3){
//            countt++;
//        }
//        numm = numm/10;
//
//    }
//        System.out.println(countt);
//
//
//    }
//
//        int no = 11;
//        int count = 2;
//        int temp = 0;
//        if (no<=1){
//            System.out.println("nor prime nor composite");
//        }
//        for (int i=count;i<=no; i++){
//            if (no%i==0){
//                temp =temp+1;
//            }
//        }
//        if (temp>1){
//            System.out.println("not prime");
//        }
//        else {
//            System.out.println("prime");
//        }
//        int n =1000;
//        int sum = 0;
//        for (int i = 100; i<=n; i++){
//            int rem = n%10;
//             n = n/10;
//             sum = sum+rem*rem*rem;
//            System.out.println(sum);
//        }
//        for (int i=5; i>1; i--){
//            System.out.println(i);
//        }
        for (int i=0; i<6; i++){
            if (i<3){
                continue;
            }
            System.out.println(i);
        }
    }
}




