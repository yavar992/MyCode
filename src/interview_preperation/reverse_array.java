package interview_preperation;

public class reverse_array {

    static void reverse(int[] arr){
        int start = 0;
        int  end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int [] arr , int index1 , int index2){
        int temp;
        temp= arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 4, 55, 57};

        reverse(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
