package DSA.binary_search;

public class occurance_of_a_element {
    static int leftoccurance(int[]arr , int target){
        int start = 0;
        int end = arr.length-1;
        int res =-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]==target){
                res = mid;
                end = mid-1; // checking the same element on the left sorted array
            }
            else if (target<arr[mid]){
                end = mid-1;
            }
            else start = end+1;
        }
        return res;
    }
    static int rightoccurance(int[]arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        int res = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                res = mid;
                start = mid + 1; //if element found keep checking the same element on the side sorted array
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else end = mid - 1;
        }
        return res;
    }

    static boolean occurance(int left , int right){
        int [] arrr = {12,12,24,24,24,24,43,43,43,45};
        int target = 24;
        left = leftoccurance(arrr,target);
        right = rightoccurance(arrr,target);
        // to check the occurance of element in an array
        int occurance = right-left+1;
        if (occurance>1){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] array = {2,6,6,6,10,10,10,34,34,87};
        int target = 6;
      int fe =  leftoccurance(array,target);
        System.out.println(fe);
//        int occur =   indexOfoccurance(array,target);
//        System.out.println(" the index of target element is " +occur);
//        int d = leftoccurance(array,target);
//        int f = rightoccurance(array,target);
////        System.out.println(f);
//        System.out.println(d);

       boolean count =   occurance(leftoccurance(array,target),rightoccurance(array,target));
      //  System.out.println(" the occurance of " + target + " is " + count);
    }

    //
// return true if the occurance of a number is more than one time


    static boolean leftoccurences(int[]arr , int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            int res = 0;
            if (arr[mid]==target){
                res = mid;
                // first we will check on the left side of array
                if (target<arr[mid]){
                    end = mid-1;
                }
            }
            if (res>1){
                return true;
            }
        }
        return false;
    }

    static boolean rightoccurence(int[]arr , int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            int res = 0;
            if (arr[mid]==target){
                res = mid;
                // first we will check on the left side of array
                if (target<arr[mid]){
                    start = mid+1;
                }
            }
            if (res>1){
                return true;
            }
        }
        return false;
    }

//    static boolean occurances(int leftside , int rightside){
//        int []arr = {2,3,3,4,4,4,5,6,6,8,8,9};
//        int target = 6;
//        leftside = leftoccurance(arr,target);
//       // rightside = rightoccurence(arr,target);
//return
//    }

    // return index of first occurence in an array
    static int indexOfoccurance(int[]arr , int target){
        int start = 0;
        int end = arr.length-1;
        int res =-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]==target){
                res = mid;
                end = mid-1;// checking the same element on the left sorted array
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else end = mid-1;


        }
        return res;
    }

}



