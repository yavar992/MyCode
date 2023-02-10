package Coding_ninja;

import java.util.Scanner;

public class swap_array {
    static void swap_array(int[]arr) {
        if (arr.length % 2 != 0) {
            arr[arr.length - 1] = -1;
        }
        for (int i = 0; i < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        swap_array(array);
        System.out.println("the swapped array is ;");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
