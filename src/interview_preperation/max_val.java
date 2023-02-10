package interview_preperation;

public class max_val {
    public static void main(String[] args) {
        int[] arr = {34,53,23,543,243,24,43};
       int ans =  max(arr);
        System.out.println(ans);
    }
    static int max(int[]arr){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
