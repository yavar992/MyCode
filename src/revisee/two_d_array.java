package revisee;
import java.util.Arrays;
import java.util.Scanner;

public class two_d_array {
    public static void main(String[] args) {
       // int [][] arr = new int [3][];
         // decleration
        int [][] array= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        //input
        for (int rows=0; rows<arr.length; rows++){
            for (int cols =0; cols<arr[rows].length; cols++) {
                arr[rows][cols] = sc.nextInt();
            }
        }
        // output
        //1st way to print
//        for (int rows = 0; rows< array.length; rows++){
//            for (int cols =0; cols<arr[rows].length; cols++)
//            {
//              System.out.println(arr[rows][cols] + " ");
//           //     System.out.println(Arrays.toString(arr[rows]));
//            }
//            System.out.println();
//        }
        // second way
//        for (int rows = 0; rows< array.length; rows++){
//            System.out.println(Arrays.toString(arr[rows]));
//        }
        //3rd way
        for (int [] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

