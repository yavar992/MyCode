package Coding_ninja;

import java.util.Arrays;

public class sum_pairs {
    static int[] sum_paris(int[] arr  ,int s){
        int[]count;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]+arr[j]==s){
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int s = 5;
        int[]ans = sum_paris(array,s);
        System.out.println(Arrays.toString(ans));
    }
}
