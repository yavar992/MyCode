package DSA.binary_search;
public class descending_order_search {
    public static void main(String[] args) {
        int [] arr = {98,97,95,87,76,67,65,56,54,43,33,32,23};
        int target = 32;
        int a = index(arr,target);
        System.out.println(a);
    }
    static int index(int[]arr , int target){
        int start =0;
        int end = arr.length-1;

        if (start<end){
            System.out.println("result not found");
        }

        while (start<=end){
            int mid = start + (end-start)/2;

            if (target<arr[mid]){
                start =start+1;
            } else if (target>arr[mid]) {
                end = end+1;
            }
            else return mid;
        }

        return -1;
    }

}
