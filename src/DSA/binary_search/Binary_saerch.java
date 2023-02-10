package DSA.binary_search;

//import java.util.Arrays;

public class Binary_saerch {
    public static void main(String[] args) {
        System.out.println("hii");
        int[] arr = {-112, -100, -12, -1, 3, 4, 12, 23, 56, 78, 87, 99};
        int target = 1222;
        int ans = binarysearch(arr, target);
        System.out.println(ans);

        // agnostic bs
        int[] arrry = {99,23,22,21,19,18,12,9,4,3,-11,-22,-34,-56};
        int taarget =3;
      int d =  agnosticBS(arrry,taarget);
        System.out.println(d);

    }

    // find an element from an array by binary search algorithm
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int has a fixed value so , it might be a chance that (start+end) exceed the limit of int size in java


            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }


    // agnostic binary search
    /*
    we do agnostic binary search whn we dont know tht aray are sorted or not
    here we assumed that array are sorted
    works for descending order
    if(target>middle) = end-1;
    if(target<middle) = end+1;
     */

    static int agnosticBS(int[] arry, int taarget) {
        int start = 0;
        int end = arry.length - 1;

        boolean isasc = arry[start] < arry[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arry[mid] == taarget) {
                return mid;
            }
            if (isasc) {
                if (taarget < arry[mid]) {
                    end = mid - 1;
                } else if (taarget > arry[mid]) {
                    start = mid + 1;
                }

            }

            else {
                if (taarget > arry[mid]) {
                    end = mid - 1;
                } else if (taarget < arry[mid]) {
                    start = mid + 1;
                }
            }
            }
            return -1;
        }
    }



