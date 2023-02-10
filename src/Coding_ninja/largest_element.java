package Coding_ninja;

public class largest_element {

    public static int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int [] arr ={2,3,4,5,6,6,7,8};
       int mex =  getMaxValue(arr);
        System.out.println(mex);
    }
}
