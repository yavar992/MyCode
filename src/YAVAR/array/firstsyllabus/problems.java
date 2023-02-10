//import java.util.Arrays;
//import  java.util.Scanner;
//public class problems {
//    public static void main(String[] args) {
////        //Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
////        //if employee is female, then she will work only in urban areas.
////        //
////        //if employee is a male and age is in between 20 to 40 then he may work in anywhere
////        //
////        //if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
////        //
////        //And any other input of age should print "ERROR".
////        Scanner problem = new Scanner(System.in);
////        System.out.println("your age ?");
////        //int age = problem.nextInt();
////        System.out.println("your gender ?");
////        String gender = problem.nextLine();
////        // take input and find whether if number is odd and even
////        Scanner no = new Scanner(System.in);
////        System.out.println("enter number");
////        int number = no.nextInt();
////
////        if (number % 2 == 0) {
////            System.out.println("even");
////        } else {
////            System.out.println("odd");
//        //}
//        // check if a number prime or not
////        Scanner na = new Scanner(System.in);
////        System.out.println("enter number");
////        int noc = na.nextInt();
////        int temp = 0;
////
////        for (int d = 2; d <= noc; d++) {
////            if (noc % d == 0) {
////                temp = temp + 1;
////            }
////
////        }
////        if (temp>1){
////            System.out.println("not prime");
////        }
////        else {
////            System.out.println("prime");
////        }
//
////        int num = 89;
////        int co = 2;
////        int temppp = 0;
////        while(co*co<num){
////            if (num%co==0){
////                temppp = temppp+1;
////            }
////            co++;
////        }
////        if (temppp>1){
////            System.out.println("not prime");
////        }
////        else{
////            System.out.println("prime");
////        }
////
////
//
//        //check if alphabat or not
////        Scanner alp = new Scanner(System.in);
////        System.out.println("enter alphabat");
////        char alphabat = alp.next().charAt(0);
//     int a =     lcm_hcf(4,12);
//        System.out.println("hcf is " + a);
//     int as =   lcm(3,7);
//        System.out.println("lcm is " +as);
//      int nens =  power(5,2);
//        System.out.println( "power of no is"+nens);
//        //infiniteloop();
//        int[] arr = { 2,4,54,34,433};
//        swap(arr , 21,22);
//        System.out.println(Arrays.toString(arr));
//    }
//    static int lcm_hcf(int a , int b) {
//        int gcd = 0;
//        for (int i = 1; i <= a && i <= b; i++) {
//            if ((a % i == 0) && (b % i == 0)) {
//                gcd = i;
//            }
//        }
//        return gcd;
//    }
//      static int lcm(int a , int b){
//        int lcm = a*b/lcm_hcf(a,b);
//        return lcm;
//      }
//      //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x
//
//      static int power(int no , int power){
//       int ans =1;
//       for (int i=1; i<=power; i++){
//           ans = no*ans;
//       }
//       return ans;
//      }
//
//      // infinite loop by while loop
////      static void infiniteloop(){
////        int a = 12;
////        while (a>10){
////            System.out.println("hello");
////        }
////      }
//      static void swap(int [] arr ,int index1 , int index2){
//        int temp;
//        temp = arr[index1];
//        arr[index1]= arr[index2];
//        arr[index2] = temp;
//      }
//    }
//
//
//
//
//
