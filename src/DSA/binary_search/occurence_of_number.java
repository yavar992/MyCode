package DSA.binary_search;

public class occurence_of_number {
    static int left(int[]arr ,int target){
        int start =0;
        int end =arr.length-1;
        int ans = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target==arr[mid]){
                ans = mid;
                end = mid-1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }
            else start = mid+1;

        }
        return ans;
    }


    // right occurence
    static int right(int[]arr , int target){
        int start =0;
        int end =arr.length-1;
        int ans = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target==arr[mid]){
                ans = mid;
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }
            else start = mid+1;

        }
        return ans;
    }

    // occurence of a number
    static int occurence(int[]arr , int start , int end , int target){
        start = left(arr,target);
        end = right(arr,target);
        int occurence = end-start+1;
        return occurence;
    }

    public static void main(String[] args) {
        int[] arr = {2,10,10,10,10,10,10,56,10};
        int target = 10;
      int left_occurence =  left(arr,target);
        System.out.println("left occurence is at"  +left_occurence);
       int right_occurence =  right(arr,target);
        System.out.println("right occurence is at " + right_occurence);

        int total_occurence =  occurence(arr,left_occurence,right_occurence,target);
        System.out.println("total no of target occurence is "  +total_occurence);
    }
}
