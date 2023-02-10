package revisee;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //syntex
        int [] age = new int[3];
        age[0] = 12;
        age[1]=21;
        age[2] = 32;
        for (int i =0; i<3; i++){
          //  System.out.println(age[i]);
        }
        Scanner scs = new Scanner(System.in);
        int [] marks = new int[5];
        for (int i=0; i<marks.length; i++){
            marks[i] = scs.nextInt();
        }
       for (int i=0; i<marks.length; i++){
           //System.out.println(marks[i]);
        }
        for (int mark : marks) {
           // System.out.println(mark);
        }
        marks[2] = 221;
       // System.out.println(Arrays.toString(marks)); // the best way
        Scanner sd = new Scanner(System.in);
        String [] name = new String[3];

        int[] arr = {1,3,4,5,3,2};
        swap(arr, 0,1);
       // System.out.println(Arrays.toString(arr));
      //   concet the two array
        int[] array1 = {1,2,3,4};
        int [] array2 = {5,6,7,8};
        int[] concet_array = {array1.length+array2.length};

        int counter = 0;
        for (int i = 0; i <array1.length ; i++) {
            concet_array[i] = array1[i];
            counter++;
        }
        for (int j=0; j<array2.length; j++){
            concet_array[j] = array2[j];
        }

        for (int i = 0; i <concet_array.length; i++) {
          //  System.out.println(Arrays.toString(concet_array));
        }

        int [] array = { 2,2,4,3,5,3,3};
      //  System.out.println(Arrays.toString(array));

       int sds = smallet(array);
       // System.out.println(sds);
       int a = concet(array);
        //System.out.println(a);
        findelement(array,21);
      //  System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println("the reverse array is " +Arrays.toString(array));
      int  d =  maxvalue(array);
       // System.out.println(d);
    }
    static void swap(int [] arr , int index1 , int index2){
        int temp;
                temp= arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    // find maximum value in  a array

    static int maxvalue(int [] arr){
        int maxvalue = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (maxvalue<arr[i]){
                maxvalue=arr[i];
            }
        }
        return maxvalue;
    }

    // reverse the  array

    static void reverse(int[] arr){
        int start = 0;
       int  end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;

            end--;
        }
    }
    // find element in an array
    static void findelement(int[] arr , int a){
        a =21;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==a){
                System.out.println(arr[i]);
            }
        }
    }
    static int concet(int []arr){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum = arr[i]+sum;
        }
        return sum;
    }
    // smallet element in array
    static int smallet(int[]arr){
        int smallest = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (smallest>arr[i]){
                smallest= arr[i];
            }
        }
        return smallest;
    }


    }

