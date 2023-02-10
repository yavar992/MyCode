package DSA.binary_search;

public class check_if_element_is_in_arr_or_not {
    public static void main(String[] args) {
        int [] arr = {2,12,13,23,34,35,56,76,87,87,88,92,101};
        int target = 34;
        boolean c = check(arr,target);
        System.out.println(c);
    }

    static boolean check(int[]arr , int target){
        int start = arr[0];
        int end = arr.length-1;

        if (start>end){
            System.out.println("element doesn't found");
        }
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target>arr[mid]){
                start = start+1;
            }
            if (target<arr[mid]){
                end = end-1;
            }
            else if (arr[mid]==target){
                return true;
            }
        }
        return false;
    }
}
