package DSA.binary_search;

import java.util.Arrays;

public class SEARCH_CHRACTER {
    static int searchname(char[]chars , char target){
        int start = 0;
        int end = chars.length-1;
        while (start<=end){
            int mid = start+ (end-start)/2;
            if (chars[mid]==target){
                return mid;
            }
            else if (chars[mid]>target){
              end = mid-1;
            } else  {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        char[] books = {
               'a','b','c','d','e','f'
        };
        char target = 'b';
        System.out.println(Arrays.binarySearch(books,target));

//
        int res =  searchname(books,target);
        System.out.println("the index of the search element is  "+ res);
    }
}
