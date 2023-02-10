package Coding_ninja;

public class duplicate_number {
    public static void main(String[] args) {
        int[]arr = {0,1,2,2,3};
        int ans = duplicate_number(arr);
        System.out.println(ans);
    }
    static int duplicate_number(int[]arr){
        // number in array shoule be from 0 to N-2
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[i+1]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
