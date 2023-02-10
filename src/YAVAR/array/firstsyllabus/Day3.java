////date 16 aug 2022
/////the day of rivison
//package YAVAR;
//
//
//public class Day3 {
//    public static void main(String[] args) {
////         int no = 89;
////         int count = 2;
////         int temp = 0;
//////         if (no==1){
//////             System.out.println("nor prime nor composite");
//////             }
////         for (count=2; count<=no; count++){
////             if (no%count==0){
////                 temp = temp+1;
////             }
////         }
////         if (temp==1){
////             System.out.println("prime");
////         }
////         if (temp>1){
////             System.out.println("not prime");
////         }
//         //problem no 2 ..to find out whether if numbr is leap year or not
////        int year = 2022;
////         if (year%400==0){
////             System.out.println("leap year");
////         } else if (year%4==0) {
////             System.out.println("leap year");
////         } else if (year%100==0) {
////             System.out.println("not a leap year");
////         }
////         else{
////             System.out.println("not a leap year");
////         }
//         ///take a input as integer and print rhe table of that number
////        Scanner sc = new Scanner(System.in);
////        System.out.println("enter number");
////        int table = sc.nextInt();
////        int temp;
////
////
////        for (int i =1; i<=10; i++){
////            temp = i*table;
////            System.out.println(temp);
////        }
////        //calculate body mass index
////        double height = 1.75;
////        double weight = 59;
////        double h = height*height;
////        double bmi;
////        bmi= weight/h;
////        System.out.println(bmi);
//
//
//        //sum of first n number
////        int temp = 0;
////        for (int i = 0; i<=10; i++){
//
//
////            temp = temp+1;
////            System.out.println(temp);
////        }
//
//        // finf the lcm and hcf or two number
//
////        int a = 81;
////        int b = 153;
////        int gcd = 1;
////        for (int i = 1; i<=a && i<=b; i++){
////            if (a%i==0 && b%i==0){
////                gcd = i;
////            }
////        }
////        System.out.println(gcd);
////        //lcm
////        int lcm = a*b/gcd;
////        System.out.println(lcm);
//
//        //finf the gretest numbr b/w three number
////        int a = 12;
////        int b = 44;
////        int c = 352;
////
////        int greatest =a;
////
////        if (b>a){
////            greatest = b;
////        }
////        if (c>b){
////            greatest = c;
////        }
////        System.out.println(" the maximum number is  " + greatest);
////
//
//        // take a inout from a user and find whether its upparcase or lowercase
////
////        Scanner sc = new Scanner(System.in);
////        System.out.println("enter input");
////        char ch = sc.next().charAt(0);
////
////        if (ch>='a' && ch<='z'){
////            System.out.println("lowercase");
////        } else if (ch>='A' && ch<='Z') {
////            System.out.println("upparcase");
////        }
////        else{
////            System.out.println("invalid input");
////        }
//
//
//        // Find the occurance of a digit in a number
////        long a = 3765376335373l;
////        long temp  = 0;
////        while(a>0){
////            long rem = a%10;
////            if (rem==3){
////                temp = temp+1;
////            }
////            a  = a/10;
////
////        }
////        System.out.println(temp);
//
//
//        //factorial of any number
////        int b = 5;
////        int fc = 1;
////        for (int i = 5; i>0; i--){
////            fc= fc*i;
////        }
////        System.out.println(fc);
//
//        // reverse the order of hr numbr
////        int a =234567;
////        int result = 0;
////        for (int i=1; i<=a; i++){
////            int rem = a%10;
////            result = result*10+rem;
////            a = a/10;
////        }
////        System.out.println(result);
//////
////        int a = 2345678;
////        int res = 0;
////        while(a>0){
////            int rem = a%10;
////            res = res*10+rem;
////            a = a/10;
////        }
////        System.out.println(res);
//
//        // switch case
//        /*
//        syntex
//        switch(expression){
//        case1
//        sout
//        break;
//        caae2
//        sout
//        break;
//        case3
//        sout
//        break;
//
//         */
//
//       // Scanner sc = new Scanner(System.in);
//      //  System.out.println("enter input");
////        String fruits = sc.nextLine();
////
////        switch (fruits) {
////            case "mango" -> System.out.println("king of fruits");
////            case "fruits" -> System.out.println("beauty of kashmir");
////            case "orange" -> System.out.println("juicy fruits");
////            default -> System.out.println("invalid input");
//        //}
////        int no = sc.nextInt();
////
////        switch (no) {
////            case 1 -> System.out.println("sunday");
////            case 2 -> System.out.println("monday");
////            case 3 -> System.out.println("tuesday");
////            case 4 -> System.out.println("wednesday");
////            case 5 -> System.out.println("thrusday");
////            case 6 -> System.out.println("friday");
////            case 7 -> System.out.println("saturday");
////            default -> System.out.println("invalid input");
////        }
////
//
//        //NESTED SWTICH STATEMENT - SWITCH INSIDE SWITCH
////        Scanner sc = new Scanner(System.in);
////        int empid = sc.nextInt();
////        String dep = sc.next();
////
////        switch (empid) {
////            case 1 -> System.out.println(" rahul kumar");
////            case 2 -> System.out.println(" vineet panwar");
////            case 3 -> {
////                System.out.println("employee no 3");
////                switch (dep) {
////                    case "it" -> System.out.println("IT department");
////                    case "management" -> System.out.println("management department");
////                    default -> System.out.println("invalid department");
////                }
////            }
////            default -> System.out.println("invalid input");
////        }
//
//
////        Scanner sc = new Scanner(System.in);
////        System.out.println("enter input here");
////        int days = sc.nextInt();
////        String ocassion  = sc.next();
////
////        switch (days){
////            case 1:
////                System.out.println("sunday");
////                break;
////            case 2:
////                System.out.println("monday");
////                break;
////            case 3:
////                System.out.println("tuesday");
////                break;
////            case 4:
////                System.out.println("wednesday");
////                break;
////            case 5:
////                System.out.println("thrusday");
////                break;
////            case 6:
////                System.out.println("friday");
////                switch (ocassion) {
////                    case "eid" :
////                        System.out.println("eid is on friday");
////                        break;
////                    case "last roza" :
////                        System.out.println("last ramzan is on friday");
////                }
////                break;
////            default:
////                System.out.println("ramzan");
////                break;
////            case 7:
////                System.out.println("saturday");
////                break;
////        }
//
//
//        // function and methods in java
//
//
//     boolean a =   isPalindrome(122);
//        System.out.println(a);
//
//
//    }
//    public boolean isPalindrome(int a) {
//
//
//        int ans = 0;
//        int original = a;
//        while (a>0){
//            int rem = a%10;
//                ans = ans*10+rem;
//            a = a/10;
//        }
//        if (original==ans){
//            return true;
//        }
//        return false;
//    }
//}
