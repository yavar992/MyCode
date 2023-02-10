package revisee;

import java.util.Arrays;

public class conditonal_and_loops {
    public static void main(String[] args) {
        //Subtract the Product and Sum of Digits of an Integer
        int a =43;
        while (a>0){
            int num1 = a%10;
            a = a/10;
            int num2 = a%10;
            a = a/10;
          int new_no =  num1 +num2;
          int sol = (num1*num2) - (num1+num2);
            System.out.println(sol);
            System.out.println(new_no);
        }
// concet the two array
        int[] array1 = {1,2,3,4};
        int [] array2 = {5,6,7,8};
        int[] concet_array = new int[array1.length+array2.length];

        int counter = 0;
        for (int i = 0; i <array1.length ; i++) {
            concet_array[i] = array1[i];
            counter++;
        }
        for (int j=0; j<array2.length; j++){
            concet_array[counter++] = array2[j];
        }

//        for (int i = 0; i <concet_array.length; i++) {
//            System.out.println(Arrays.toString(concet_array));
//        }

        System.out.println(Arrays.toString(concet_array));
    }
}
