package binary_search_problem;

public class floor {
    public static void main(String[] args) {
        int [] arr = {2,5,8,11,16,17,22};
        int target =33;
        int ans =   ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[]arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<end){

            int mid  = start+(end-start)/2;
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
        return end;
    }

}
