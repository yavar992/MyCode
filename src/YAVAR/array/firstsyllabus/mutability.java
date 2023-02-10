package YAVAR.array.firstsyllabus;
// date 26/08/2022
import java.util.Arrays;

public class mutability {
    public static void main(String[] args) {
        int[]nums ={4,3,45,34,3};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    // mutability of array -- array are mutable means that array object can be changecd
    static void change(int[] arr){
        arr[0] = 234;
    }

}
