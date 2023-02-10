package YAVAR.array.firstsyllabus;

public class conditional_statement {
    public static void main(String[] args) {
        //if condition statement
        int x = 10;
        if (x > 3) {
            System.out.println("x is greater than 4 ");
        }
        // if else statement
        int a = 12;
        int b = 100;
        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
        //if-else-if statement
        //programm if a boy number is above 80 then he get a bike andf if his marks is above 60 and below 80 he will get a cycle
        //and if his marks is less thn 0 he will get thappad

        int c = -1;
        //check if number is greater than 0
        if(c>0){
            System.out.println("c is greater than 0");
        } //check if number is less than 0
        else if (c<0) {System.out.println("c is less than 0");
        }
        // check is number is equal to 0
        else {
            System.out.println("c is equal to 0");
        }


    }
}
