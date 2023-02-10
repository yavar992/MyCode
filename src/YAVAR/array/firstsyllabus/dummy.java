package YAVAR.array.firstsyllabus;

import java.util.Arrays;

public class dummy {
    public static void main(String[] args) {
        int [] ars = {1,2,3,4,5,6};


        System.out.println(Arrays.toString((ars)));
    }
    static int sumofarray(int[]arr){
        int sum =0;
        for (int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }

        return sum;
    }
}
