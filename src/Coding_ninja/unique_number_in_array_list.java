package Coding_ninja;

import java.util.Arrays;

public class unique_number_in_array_list {
    public static void main(String[] args) {
    int [] arrray = {1,3,1,3,6,6,7,10,7};
    int ans = unique_number(arrray);
        System.out.println(ans);
    }
    static int unique_number(int[]arr){
        int dup = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j =i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    dup = i;
                }
            }

        }
        return -1;
    }
}
