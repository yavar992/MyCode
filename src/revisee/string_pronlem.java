package revisee;
import java.util.Arrays;
import java.util.Scanner;
public class string_pronlem {
    public static void main(String[] args) {
        String [] lcp = {"geeksforgeeks", "geeks", "geek", "geezer"};
        for (int i = 0; i <lcp.length ; i++) {
            //System.out.println(lcp[i]);
        }
        char[] s1 = {'a','n','a','g','r','a','m'};
        char[] s2 = {'n','a','a','g','a','r','m'};
        anargram(s1,s2);
        if (!anargram(s1,s2)){
            System.out.println("string are not anagram"+anargram(s1,s2));
        }
        System.out.println("string are anagram" + anargram(s1,s2));
        String str = "scholar trainee";
        str.toLowerCase();
        char[] c = str.toCharArray();
        int vowel =0;
        int constant = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'){
                vowel++;
            }
            else if (c[i]>='a' && c[i]<='z'){
                constant++;
            }
        }
        System.out.println("no of vowel is " + vowel);
        System.out.println("no of constant is " + constant);
        String sttr = "abcdcba";
      //  System.out.println(ispalin(sttr));
       // System.out.println(str.length());
       // System.out.println(ispalindrome(str));
        String stsr = "yavar";
       // System.out.println(reverse(stsr));
    }
    // check if a string is a palindrome or not
    static boolean ispalindrome(String str){
        if (str==null || str.length()==0){
            return true;
        }
        str.toLowerCase();

        for (int i = 0; i < str.length()/2; i++) {
            char start  = str.charAt(0);
            char end  = str.charAt(str.length()-1-i);
            if (start==end){
                return true;
            }
        }
        return false;
    }

    // same qustion with while loop
    static boolean ispalin(String str){
        int i =0;
        while (str.length()/2>0){
            char start = str.charAt(0);
            char end = str.charAt(str.length()-1-i);
            if (start==end){
                return true;
            }
            i++;
        }
        return false;
    }

    //return a string in reverse order
    static String reverse(String str){
        String reverse ="";
        for (int i=str.length()-1; i>=0; i--){
             reverse  =reverse+ str.charAt(i);
        }
        return reverse;
    }
// check if two string is anargn or not
    static boolean anargram(char[] s1, char[] s2){
        int n1 = s1.length;
        int n2 =s2.length;
        if (n1!=n2){
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for (int i = 0; i <n1 ; i++) {
            if (s1[i]!=s2[i]){
                return false;
            }
        }
        return true;
    }


}
