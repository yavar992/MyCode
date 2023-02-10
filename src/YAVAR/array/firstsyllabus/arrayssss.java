package YAVAR.array.firstsyllabus;

import java.util.Arrays;

public class arrayssss {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,7,8};
        reverse(arr);
//        int  array [] = {3,34,3,2,42,32,2,23};
//        for (int i=0; i<array.length; i++){
//            System.out.println(array[i]);
//        }


//
//        Scanner sc = new Scanner(System.in);
//        int [] aray = new int[5];
//        for (int i=0; i<aray.length; i++){
//            aray[i] = sc.nextInt();
//            System.out.println(" " + aray[i] + " ");
//        }
//
//        System.out.println("enter search numbr");
//        int n = sc.nextInt();
//       int count = 0;
//        for (int i=0; i<aray.length; i++){
//            if (aray[i]==n){
//                count = count+1;
//            }
//        }
//        if (count==1 || count>1){
//            System.out.println("item found " );
//        }
//        else
//         System.out.println(" item not found");


        /// 2d array
        // a sort or kind of matrix
        /* syntex
        int [][] arr = new int [no of rows ][no of column];
        for input
        for(int i=0; row<rows.length; rows++){
        for(int j=0; cols<[rows].length; cols++){
        arr[rows][cols] = sc.nextint();
        }
        }
        for output
        for(int i=0; rows<rows.length; row++){
        for(int j=0; cols<[rows].length; cols++){
        arr[rows][cols] = sc.nextint();
        sout(arr[rows][cols];
        sout() // for space
         */

//        Scanner sd = new Scanner(System.in);
//        int[][] arrays = new int[3][2];
//        //input
//        for (int rows = 0; rows < arrays.length; rows++) {
//            for (int cols = 0; cols < arrays[rows].length; cols++) {
//                arrays[rows][cols] = sd.nextInt();
//            }
//        }

        // for output
//        for (int rows = 0; rows < arrays.length; rows++) {
//                System.out.println(Arrays.toString(arrays[rows]));
//            }
//            System.out.println();
//        }
//        method no 1
//        for (int rows = 0; rows < arrays.length; rows++){
//            System.out.println(Arrays.toString(arrays[rows]));
//        }
//        System.out.println();
        //  method no 2
//        for (int [] a : arrays){
//            System.out.println(Arrays.toString(a));
//        }


        // queston make an array of 4*2 metrix
//        Scanner se = new Scanner(System.in);
//        int [][] metrix = new int[3][3];
//        // for input
//        for (int rows =0; rows< metrix.length; rows++){
//            for (int cols=0; cols<metrix[rows].length; cols++){
//                metrix[rows][cols] = se.nextInt();
//            }
//        }
//        // fr output
//        // ist method
////        for (int [] d : metrix){
////            System.out.println(Arrays.toString(d));
////        }
//        //2nd method
//        for (int rows=0; rows< metrix.length; rows++){
//            System.out.println(Arrays.toString(metrix[rows]));
//        }
//        System.out.println();
//        // print this array
//
//        int [][] anarr = {
//                {1,2,3,4},
//                {5,6} ,
//                {7,8,9}};
//
//        for (int rows=0; rows< anarr.length; rows++){
//            System.out.println(Arrays.toString(anarr[rows]));
//        }


        /// array list

        // swap the element of two array

//        int [] arrr = {1,3,19,9,28};
//             swap(arrr , 1,3);
//        System.out.println(Arrays.toString(arrr));


        //
//        int [] nam = {1,23,43,21,5,43};
//        System.out.println(maxval(nam));
        //
//        int [] arrr = {12,2,34,22,311,34,1,3,132,113,4,4,444,};
//        marange(arrr ,3,6);
//        System.out.println(marange(arrr, 4,8));
//    }


        // return the maximum value from an array

//    static int maxval(int [] no){
//        int maxvalue = no[0];
//        for (int i=0; i<no.length; i++){
//            if (no[i]>maxvalue){
//                maxvalue = no[i];
//            }
//        }
//        return maxvalue;
//    }


        /// find the maximum element in a range
//    static int marange(int [] arr , int start , int end){
//        int maxval = arr[start];
//        for (int i=start; i<end; i++){
//            if (arr[i]>maxval){
//                maxval = arr[i];
//            }
//        }
//        return maxval;
        int arra [] = {12,23,43,25,53,423,2};;
        //swap(arr,0,6);
        reverse(arra);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[] , int index1 , int index3) {
        int temp = arr[index1];
        arr[index1] = arr[index3];
        arr[index3] = temp;
    }

        /// reevrse the array
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}


