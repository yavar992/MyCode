package interview_preperation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class taking_input_for_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        for (int arr:array) {
            System.out.println(arr);
        }

        int[]arr = {1,2,3,4,5,5};
        System.out.println(Arrays.toString(arr));
    }
}
