package binary_search_problem;

public class ceiling {
    public static void main(String[] args) {
        int [] arr ={1,5,8,11,16,17,22,33,36,54,56,57};
        int target =54;
        int ans =   ceiling(arr,target);
        System.out.println(ans);
     }
    static int ceiling(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<end){

            int mid  = start+(end-start)/2;
            if (arr[mid]>arr.length-1){
                return -1;
            }
            if (target==arr[mid]){
                return mid;
            }
            else if (target<arr[mid]){
                end = mid-1;
            }
            if (target>arr[mid]){
                start = mid+1;
            }

        }
        return start;
    }
}
