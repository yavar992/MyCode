package DSA.binary_search;

public class parallel_linear_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 20, 21, 34, 54};
        int target = 21;
        boolean n = search(arr, target);
        //  System.out.println(n);
        int targett = 6;
        int f = insert_index(arr, targett);
        //   System.out.println("the insert position of target element will  be " + f);
        String name = "YES sir";
        boolean d = detect_capital(name);
      //  System.out.println(d);

        int[] arrw= {1,2,4};
        int g = missing(arrw);
        System.out.println(g);
        // search whether 21 is in arrar or not

        //count occurence
        int [] numbers  = {1,2,2,2,2,24,4,4,45,5,6,7,8};
        int targetc=2;
       int nums =  count_occurece(numbers,targetc);
        System.out.println("the occurence of the "+target + " element is "+nums);
    }

    static boolean search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }

        }
        return false;
    }

    // find the index no of insert element
    static int insert_index(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            } else if (arr[i] > target) {
                return i;
            }
        }
        return -1;
    }

    // detect capitals
    static boolean detect_capital(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch>='A' && ch<='Z'){
                return true;
            }
        }
        return false;
    }

    // find missing no in a sorted array
    static int missing(int[] arr){
        int missing_no;
        for (int i = 0; i <arr.length ; i++) {
            i=0;
            if (arr[i]+arr[i+1]==arr[i]){
                missing_no = arr[i];
                return missing_no;
            }
        }
        return -1;
    }

    /// count the occurence of element in an array
    static int count_occurece(int [] arrr ,int target){
        int count = 0;
        for (int i = 0; i < arrr.length; i++) {
            if (arrr[i]==target){
                count++;
            }
        }
        return count;
    }
}

