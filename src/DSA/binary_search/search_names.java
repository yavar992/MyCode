package DSA.binary_search;

import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class search_names {
static int searchname(String[]str , String target){
    int start = 0;
    int end = str.length-1;
    while (start<=end){
        int mid = start+ (end-start)/2;
        if (str[mid]==target){
            return mid;
        }
        else if (str[mid].compareToIgnoreCase(target)<0){
            start = mid+1;
        } else  {
            end = mid-1;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        String[] books = {
                "Fatality","Fidelity","Holy", "Immortal","In the Hood", "Mayor","The Major"
        };
       String target = "Holy";


//
        int res =  searchname(books,target);
        System.out.println("the index of the search element is  "+ res);
   }
}