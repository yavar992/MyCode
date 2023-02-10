package Coding_ninja;

import java.util.Scanner;

public class return_array_sum {
    static int sum(int[] arr){
    int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];

        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
