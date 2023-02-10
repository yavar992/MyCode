package Coding_ninja;

public class return_index_of_element_in_a_array {
    static int find(int[] arr , int val){
        for (int i = 0; i < arr.length; i++) {
            if (val==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr = {2,3,4,6,7,6,77,64,67,0};
        int val = 7;
        int sol = find(arr,val);
        System.out.println(sol);
    }

}
