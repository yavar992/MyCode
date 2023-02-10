package YAVAR.array.firstsyllabus;

import static oops.a.inheritence.c.name;

public class abc {
    public static void main(String[] args) {
        name();
        System.out.println("yavar ali khan");
        //exponentation
        System.out.println(Math.pow(4,3));
        System.out.println(Math.exp(4));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.cbrt(27));
        // trigonometry
        System.out.println(Math.sin(60));
        System.out.println(Math.tan(Math.toRadians(45)));
        System.out.println(Math.sin(Math.toDegrees(45)));

        // absolute value
        System.out.println(Math.abs(-34.43));

        // LOGICAL OPERATOR
        //Introduction#
        //Logical expressions are also known as Boolean expressions. It will always evaluate to a value of either true or false. Therefore, they will be represented by the data type boolean. While they may seem similar to mathematical operators, the difference lies in how they are used with comparative or boolean operators. Let’s look at both types of operators in detail.

        // COMPARATIVE OPERATOR
        //Java has several operators that can be used to compare value. Comparison implies knowing which value is greater than the other, or equal to it, and so on. The table below shows the entire list of operators available in Java.

//        int x = 5;
//        int y = 4;
//
//        //comparative operators
//
//        System.out.println("x ia equal to :" + x);
//        System.out.println("y is equal to :" + y);
//        // y is less than x
//        System.out.println(x<y);
//        System.out.println(x>y);
//        System.out.println(x<=y);
//        System.out.println(y>=x);
//        System.out.println(x!=y);
//        System.out.println(x==y);

        char abc = 'f';
        char abd = 'f';
        System.out.println(abc>abd);
        System.out.println(abc==abd);

        //Boolean operators
       //!	Boolean NOT
        //&&	Boolean AND
        //||	Boolean OR
        //^	Boolean exclusive XOR
        boolean ab =  true ;
        boolean ac = false;
        System.out.println("the valu of ab is :" + ab + " and the value of ac is : "+ ac);
        System.out.println(!ac);
        System.out.println(ab&&ac);
        System.out.println(ab|| ac);
        System.out.println(ab^ac);

        // problem of the day
        //cuberoot Math.cbrt((Math.sqrt(x,x) + Math.sqrt(y,y) - Math.abs(z));
        int x = 6;
        int y = 4;
        int z = 5;
        double answer;


        double sum = Math.pow(x,6) + Math.pow(y,4);
        double sub = sum - Math.abs(z);
        answer = Math.cbrt(sub);
        System.out.println(answer);

        //another problem
        double  a = 5;
        double b = 5;
        double solution;

        double sum_square = Math.pow(a,2) + Math.pow(b,2) + (Math.pow(a,2) + Math.pow(b,2) + 2*a);
        solution = Math.cbrt(sum_square);
        System.out.println(solution);

        //casting ---
        //Type casting is when you assign a value of one primitive data type to another type.
        //
        //In Java, there are two types of casting:
        //
        //Widening Casting (automatically) - converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double
        //
        //Narrowing Casting (manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int -> char -> short -> byte
        // widening cating "( automatically)
        int myint = 9;
        double mydoyble = myint;
        System.out.println(myint);
        System.out.println(mydoyble);

        // narrowing casting
        double aa = 12;
        int as = (int) aa ;
        System.out.println(aa);
        System.out.println(as);












    }
}
