package YAVAR.array.firstsyllabus;

import java.util.*;
public class Taking_input {
    public static void main(String[] args) {
//        //A school has following rules for grading system:
//        //a. Below 25 - F
//        //b. 25 to 45 - E
//        //c. 45 to 50 - D
//        //d. 50 to 60 - C
//        //e. 60 to 80 - B
//        //f. Above 80 - A
//        //Ask user to enter marks and print the corresponding grade.
////
////         int a = yavar.nextInt();  Scanner yavar = new Scanner(System.in);
//////         System.out.println("please enter your grade");
////         if(a<25){
////             System.out.println("you are fail");
////         } else if ((a>=25)&&(a<45)) {
////             System.out.println("you're grade is E ");
////         } else if ((a>=45)&&(a<50)) {
////             System.out.println("you're grade is D");
////         } else if ((a>=50)&&(a<60)) {
////             System.out.println("you're grade is C");
////         } else if ((a>=60)&&(a<80)) {
////             System.out.println("you're grade is B");
////         }
////         else{
////             System.out.println("you're gradwe is A");
////         }
//
////        //Take input of age of 3 people by user and determine oldest and youngest among them.
////        Scanner yavar = new Scanner(System.in);
////    System.out.println("please enter your AGE");
////       int a = yavar.nextInt();
////        System.out.println("please enter your AGE");
////        int b = yavar.nextInt();
////        System.out.println("please enter your AGE");
////        int c = yavar.nextInt();
////        if((a>b) && (a>c)){
////            System.out.println("");
//
//        //should get the first letter of the first name, middle name, and last name and append (concatenate) them together and then return them all in lowercase
//        //problems
//        String namw1 = "AHMAD";
//        String name2 = "RAKESH";
//        String name3 = "SONU";
//
//        String new_string = namw1.substring(0, 1) + name2.substring(0, 1) + name3.substring(0, 1);
//        System.out.println(new_string.toLowerCase());
//
//        // print first three letter of a string and all those three words should be in lowercase
//        String word = "ELEPHANT";
//        String new_word = word.substring(0, 3);
//        System.out.println(new_word.toLowerCase());
//
//        //A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//        //Take following input from user
//        //Number of classes held
//        //Number of classes attended.
//        //And print
//        //percentage of class attended
//        //Is student is allowed to sit in exam or not.
////           Scanner yavar = new Scanner(System.in);
////           int total_no_of_class = 80;
////               System.out.println( "total class:" +total_no_of_class);
////               System.out.println("number of class you attempt :");
////               int b = yavar.nextInt();
////                int per = b*100/total_no_of_class;
////                boolean medical = true;
////
////               //System.out.println(per);
////               if(per>75){
////                   System.out.println("please download your admit card from website");
////           }
////                   else{
////                       System.out.println("you cannot give exam");
////                   }
//
//
//        /// take three input from a user and print oldest and youngest among them
////             Scanner age = new Scanner(System.in);
////               System.out.println("write your age here");
////               int a = age.nextInt();
////               System.out.println("write your age here");
////               int d = age.nextInt();
////               System.out.println("write your age here");
////               int c = age.nextInt();
////
////               if((a>d) && (a>c) && (d>c) ){
////                   System.out.println("th greatest number is :" + a + " and the smallest number is d :" +c);
////               } else if ((a<d) && (d>c) && (c>a)){
////                   System.out.println("the greatest number is :" + d + " and the smallest number is :" + a);
////               } else if ((c>a) && (c>d) && (a>d)) {
////                   System.out.println("the greatest number is :" +c + " and the smalllest number is :" +d);
////               }
////               else{
////                   System.out.println("you are typing more than 3 input");
////               }
//        //Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
//        //if employee is female, then she will work only in urban areas.
//        //
//        //if employee is a male and age is in between 20 to 40 then he may work in anywhere
//        //
//        //if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
//        //
//        //And any other input of age should print "ERROR".
////
////        Scanner problem = new Scanner(System.in);
////                   System.out.println("write your age");
////                   int age = problem.nextInt();
////                   System.out.println("what is your gender ?");
////                   String gender = problem.nextLine();
////                   System.out.println("are you married");
////                   String martial_status = problem.nextLine();
//
//        ///switch statement
//        //BASIC SYNTEX
//        //CHAR , INT , BYTE , SGORT  = 2;
//        //switch (grade){
//        // case1 ;
//        // grade = 1;
//        //break;
//        //case2;
//        //grade= 2;
//        //break;
//        //case3;
//        //grade = 3;
//        //break;
//        //default;
//        // grade = 5 or xyz ;
//        //break
//        ///}
//        //system//////////////////;
//
////                Scanner grade = new Scanner(System.in);
////                System.out.println("write your grade here");
////                char new_grade = grade.next().charAt(0);
////
////                switch (new_grade) {
////                    case 'A':
////                        System.out.println("you are excellent");
////                        break;
////                    case 'B':
////                        System.out.println("you are outstanding");
////                        break;
////                    case 'C':
////                        System.out.println("good!");
////                        break;
////                    case 'D':
////                        System.out.println("can do better !");
////                        break;
////                    default:
////                        System.out.println("invalid grade");
////                }
////
////        Scanner age = new Scanner(System.in);
////        System.out.println("write your age here");
////        int new_age = age.nextInt();
////
////        switch (new_age) {
////            case 15:
////                System.out.println(" you are an teen");
////                break;
////            case 18:
////                System.out.println(" you are an adult");
////                break;
////            case 23:
////                System.out.println(" you are fit for job");
////                break;
////            case 60:
////                System.out.println(" you are retired now");
////                break;
////            default:
////                System.out.println("bye bye!");
////        }
////        System.out.println("thanks for using my code");
//
//
//        // print month name by their number
//        Scanner month = new Scanner(System.in);
//        System.out.println("write month number here");
//        int new_month = month.nextInt();
//
//        switch (new_month) {
//            case 1:
//                System.out.println("january");
//                break;
//            case 2:
//                System.out.println("february");
//                break;
//            case 3:
//                System.out.println("march");
//                break;
//            case 4:
//                System.out.println("aprail");
//                break;
//            case 5:
//                System.out.println("may");
//                break;
//            case 6:
//                System.out.println("june");
//                break;
//            case 7:
//                System.out.println("july");
//                break;
//            case 8:
//                System.out.println("august");
//                break;
//            case 9:
//                System.out.println("september");
//                break;
//            case 10:
//                System.out.println("october");
//                break;
//            case 11:
//                System.out.println("november");
//                break;
//            case 12:
//                System.out.println("december");
//                break;
//            default:
//                System.out.println("you enter invalid month number");
//        }
//
//        //conditional expression
//        //A conditional expression is a concise way to write the equivalent of an if-else statement.
//        //
//        //This kind of expression can help to produce highly readable assignment statements fitting onto one line of the source code.
//        //
//        //Syntax#
//        //This is the syntax:
//        //
//        //1
//        //( condition ) ? expressionIfTrue : expressionIfFalse;
//
//        int f = 65;
//        int d = 34;
//        int answer = (f > d) ? f : d;
//        System.out.println(answer);
//
//        // //A group of friends rolls a dice, and they want to figure out whether the number that comes is an even number or an odd number. They employ your coding skills to figure it out.
//        Scanner dice = new Scanner(System.in);
//        System.out.println("input the number that is come after rolling the dice");
//        int roll = dice.nextInt();
//
//        switch (roll) {
//            case 1:
//                System.out.println("odd");
//                break;
//            case 2:
//                System.out.println("even");
//                break;
//            case 3:
//                System.out.println("odd");
//                break;
//            case 4:
//                System.out.println("even");
//                break;
//            case 5:
//                System.out.println("odd");
//                break;
//            case 6:
//                System.out.println("even");
//                break;
//            default:
//                System.out.println("you enter invalid dice number");
//
//        }
//

        int g = 4;
        String rolldice;
        if (g % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        //for looop

    //    for (int s =1; s>=12; s--) {

          //  System.out.println(s);
       // }
    }
}


