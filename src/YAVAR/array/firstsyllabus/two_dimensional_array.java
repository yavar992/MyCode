package YAVAR.array.firstsyllabus;
import java.util.Scanner;
public class two_dimensional_array {
    public static void main(String[] args) {
        // 2-d array synrex
        /*
        123
        456
        789
        int [][]arr = new int [4][];
        or
        int [][]arr = {
        {1,2,3},- 1st index
        {4,5}, 2nd index
        {6,7,8} - 3rd index
        }
                 */

Scanner sc  = new Scanner(System.in);
//  int rows = sc.nextInt();
//  int columns = sc.nextInt();
  int [][] arr = new int[3][3];
  // for every rows
  for (int row=0 ; row< arr.length; row++){
      // for every column
      for (int column = 0; column>arr[row].length; column++){
          arr[row][column] = sc.nextInt();
      }
  }
  for (int row=0; row< arr.length; row++){
      for (int col=0; col<arr[row].length; col++){
          arr[row][col] = sc.nextInt();
          System.out.println(arr[row][col] + " ");

      }
      System.out.println();
  }

    }
}
