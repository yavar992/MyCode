package Coding_ninja;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;

public class reverse_array {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9,10,11,12};
        int M = 4;
     //   reverse(array,M);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
reverse_array(arr,M);
        }

    static void reverse(int[]array , int M){
        for (int i = 0; i<=M; i++) {
            System.out.println(array[i]);
        }
        for (int i = array.length-1; i>M; i--) {
            System.out.println(array[i]);
        }
    }

    static  void reverse_array(ArrayList<Integer> arr , int M){
        for (int i = 0; i <M ; i++) {
            System.out.println(arr.get(i));
        }
        for (int i = arr.size()-1; i>=M; i--) {
            System.out.println(arr.get(i));
        }
    }
}
