package DSA.binary_search;

public class find_insert_index {

    static int insert_index(int[]arr ,int target){
      int start = 0;
      int end = arr.length-1;
      while (start<=end){
          int mid  = start + (end-start)/2;
          if (arr[mid]==target){
              return mid;
          }
          else if(arr[mid]<target){
              start = mid+1;
          }
          else end = mid-1;
      }
      return end+1;

    }

    public static void main(String[] args) {
        int [] arr = {1,4,7,11,20,21,34,54};
        int target = 22;
      int d =   insert_index(arr,target);
        System.out.println(d);
    }
}
