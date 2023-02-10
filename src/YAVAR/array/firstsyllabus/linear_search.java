package YAVAR.array.firstsyllabus;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class linear_search {
    public static void main(String[] args) {
        // search an element in an array and print the index of it

//        int [] abcd = {21,12,33,13,1,31,331,1,1,232,65};
//        int target = 33;
//        int a = linearsearch(abcd,target);
//        System.out.println(a);


        //
//        int[] ab = {12,3,4,5,54,3,4,3};
//        find(ab);
//        System.out.println(ab);


//    static int linearsearch(int [] arr , int target){
//        if (arr.length==0){
//            return -1;
//        }
//        for (int i=0; i<arr.length; i++){
//            int element = arr[i];
//            if (element==target){
//                return i;
//            }
//        }
//        return -1;
//
//        //
//        str = "yavar";
//
//    }

//    static void find(int [] arr ){
//        int count = 0;
//        int targetelement = 12;
//        for (int i=0; i<arr.length; i++){
//            if (arr[i]==targetelement){
//                System.out.println("element found at " + i + " index");
//            }
//        }
// }
        String str = "Yavar";
        //  System.out.println(Arrays.toString(str.toCharArray()));
        char target = 'v';
        boolean b = searching(str, target);
        System.out.println(b);


        //linearsearch
        int[] arr = {21, 23, 3, 45, 43, 2, 4, 4, 233};
        int targett = 2;
        int v = linearsearch(arr, targett, 3, 7);
        System.out.println(v);
        //min value
        int[] qw = {12, 3, 1, -432, 42, 234};
        int c = min(qw);
        System.out.println(c);
        ///  find a elelemt in a 2d array
        int[][] array = {
                {1, 2, 3, 4, 5},
                {21, 42, 3, 4, 533},
                {32, 3, 4, 223, 232},
                {34, 6, 4, 7, 56, 7, 8}
        };
        int  targets = 34;
      int[] bv =  find (array,targets);
        System.out.println(Arrays.toString(bv));

        // check and print thee even no of array in an array
        int [] ads = {21,234,3323,4,6755,6,543,2};
        int gf = even(ads);
        System.out.println(gf);
        //check length
        System.out.println(lengthcheck(-87678));
    }

    // search in string

    static boolean searching(String str , char target){
        if (str.length()==0){
            return false;
        }

        for (char ch: str.toCharArray()){
             if (target==ch){
                 return true;
             }
        }
        for (int i=0; i<str.length(); i++){
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

//
    // search in an range

    static int linearsearch(int [] arr , int targett ,int start ,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == targett) {
                return i;
            }
        }
        return -1;

    }

    //find minimum element in an array

    static  int min(int[] arrr){
        int minval = arrr[0];
        for (int i=0; i< arrr.length; i++){
            if (minval>arrr[i]){
                minval = arrr[i];
            }
        }
        return minval;


        // find an element innan 2d array

    }


    /// search an element jn an 2d array
    @NotNull
    @Contract(value = "_, _ -> new", pure = true)
    static int[] find(@NotNull int [][]arrays , int targets){
        for (int rows=0; rows<arrays.length; rows++){
            for (int cols=0; cols<arrays[rows].length; cols++){
                if (arrays[rows][cols]==targets){
                    return new int[]{rows,cols};
                }
            }
        }
        return new int []{-1,-1};
    }



    // most important
    /// check and print the ven no of integers in an arayy
    static int even(int[] no){
        int count =0;
       for (int num:no){
         if (checkeven(num)){
          count++;
         }
       }


     return count;
    }
    static int lengthcheck(int no){
        int count = 0;
        if (no<0){
            no = no*-1;
        }
        while (no>0){
            count++;
            no =no/10;
        }
        return count;
    }
    static boolean checkeven(int no){
        int noofdigit = lengthcheck(no);
        if (noofdigit%2==0){
            return true;
        }
        return false;
    }

    public int maximumWealth(int[][] accounts) {
        //person = row
        //customer = cols
 int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
    return ans;
    }




    }
