package revisee;

import java.util.Arrays;

public class leeetcode {
    public static void main(String[] args) {
        int[] ED ={2,4,6,7,9,11};
        int [] UG = {1,2,3,4,5,5};
    //    System.out.println();
        // remove duplicate arrqy from strig
        String str = "eleplentent";
        char [] ch = str.toCharArray();
        int count = 0;
        if (ch.length==0){
            System.out.println(ch[0]);
        }
        for (int i = 0; i<ch.length ; i++) {
            count =1;
            for (int j=i+1; j<ch.length; j++){
                if (ch[i]==ch[j] && ch[i]!=' '){
                    count++;
                    ch[j] =0;
                }
                if (count>1 && ch[i]=='0'){
                    System.out.println(ch[i]);
                }
            }
        }


        int target = 8;
      int[] nwans =  sum(ED,target);
        System.out.println(Arrays.toString(nwans));
        String defang = "1.1.1.1.1";
       // System.out.println(defang(defang));
    }
    static int[] sum(int[] arr, int target){
        for (int i = 0; i <arr.length ; i++) {
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
            }

            // defanging a string
    static String defang(String str){
        String ans ="";
        for (int i = 0; i <str.length() ; i++) {
            char c = str.charAt(i);
            if (c== '.'){
                ans =ans+"[.]";
            }
            else {
                ans= ans+c;
            }
        }
        return ans;
    }

    // TO LWERCASE
//    static String lowercase(String str){
//        String  ans ="";
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i){
//                if (c>='a' || c<='z'){
//
//                }
//            }
//        }
//    }
    //remove duplicate array from string

    }



