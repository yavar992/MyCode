package DSA.binary_search;

public class occurence_of_A_NUMBERS {
    static int occurenceOf_Number(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                res = mid;
            }
            if (res == mid) {
                end = mid - 1;
            } else start = mid + 1;

            if (target < arr[mid]) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 2, 4, 5, 6, 6, 7, 78};
        int target = 2;
       int ans =  occurenceOf_Number(array,target);
        System.out.println(ans);
    }
}
