package Coding_ninja;

import java.util.ArrayList;
import java.util.Collections;

public class swap_array_with_arraylsit {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        swapAlternate2(arr);
        System.out.println("The swapped array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[]array = {1,2,3};
//        swap(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");;
//        }
    }
    public static void swapAlternate2(int[] arr){
        for(int i=0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
//    static void swap(int[] arr){
//        for (int i = 0; i <arr.length-1 ; i++) {
//            int temp = arr[i];
//           arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
   // }
}