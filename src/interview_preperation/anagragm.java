package interview_preperation;

import java.util.Arrays;

public class anagragm {
    static void anagram(String str1 , String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
       if (str1.length() == str2.length()){
           char[]ch1 = str1.toCharArray();
           char[]ch2 = str2.toCharArray();
           Arrays.sort(ch1);
           Arrays.sort(ch2);
       boolean result =    Arrays.equals(ch1 , ch2);
            if (result){
                System.out.println(" string are anagram");
            }
            else System.out.println("string are not anagram");
       }


    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        anagram(str1,str2);
    }

}
