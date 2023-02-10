package revisee;
import java.util.Scanner;
import java.util.Arrays;

public class expirement {
    expirement() {

    }

    public static void main(String[] args) {
//        Scanner fc =new Scanner(System.in);
//        String de = fc.next();
//        System.out.println("hello");
//        System.out.println(de);
//        // convert a string into character array
//        String name = "yavar";
//        char[] ch = name.toCharArray();
//        char target = 'a';
//        for (int i = 0; i < ch.length; i++) {
//            char element = ch[i];
//            if (element == target) {
//                System.out.println(i);
//            }
//        }
//        System.out.println(Arrays.toString(ch));
//
//
        int[][] array = {
                {1, 2, 3, 37, 4, 5,},
                {3, 4, 76, 6, 4, 6, 54},
                {343, 3, 3, 5, 3, 43}
        };
        int sum = 0;
        int maxvalu = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
                System.out.println(sum);
            }
            if (sum > maxvalu) {
                sum = maxvalu;
            }
            System.out.println(sum);
        }

//    int even_counter = 0;
//    int odd_counter = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j=0; j<array[i].length; j++){
//                if (array[i][j]%2==0){
//                    even_counter++;
//                }
//                else odd_counter++;
//            }
//        }
        //  System.out.println("frequency of even is "+ even_counter);
        //System.out.println("frequency of odd "+ odd_counter);

        //Given an integer, , perform the following conditional actions:
        //
        //If  is odd, print Weird
        //If  is even and in the inclusive range of  to , print Not Weird
        //If  is even and in the inclusive range of  to , print Weird
        //If  is even and greater than , print Not Weird

        Scanner ne = new Scanner(System.in);
        int d = ne.nextInt();
        // for (int i = 1; i < 100; i++) {
        if (d % 2 == 0) {
            System.out.println("weird");
        }
        if (d % 2 != 0 && (d >= 2 && d <= 5)) {
            System.out.println("not weird");
        }
        if (d % 2 != 0 && (d >= 6 && d <= 20)) {
            System.out.println(" weird");
        }
        if (d % 2 != 0 && (d > 20)) {
            System.out.println("not weird");
        }

        // find the sum of each row in 2d array
        //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    }


    }



