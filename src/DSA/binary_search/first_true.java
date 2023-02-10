package DSA.binary_search;

public class first_true {
    static int first_True(boolean[] arr, boolean target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int has a fixed value so , it might be a chance that (start+end) exceed the limit of int size in java

            int mid = start + (end - start) / 2;

            if (!target) {
                end = mid - 1;
            } else if (target==arr[mid]) {
                return mid;
            } else {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        boolean[] arrr = {false,false,false,true,false};
        boolean target = true;
         first_True(arrr,target);
    }

}
