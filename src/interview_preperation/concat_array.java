package interview_preperation;

import java.util.Arrays;

public class concat_array {
    public static void main(String[] args) {
        int[]array1 = {1,2,3,4,5,6};
        int[]array2 = {7,8,9};
        int[]concat_array = new int[array1.length+array2.length];
        for (int i = 0; i <array1.length ; i++) {
            concat_array[i] = array1[i];
        }
        for (int i = 0; i <array2.length ; i++) {
            concat_array[array1.length+i] = array2[i];
        }
        System.out.println(Arrays.toString(concat_array));
    }
}
