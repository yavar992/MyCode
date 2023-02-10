package leetcode;

public class day1 {
    public static void main(String[] args) {
//        Subtract the Product and Sum of Digits of an Integer
        sum_sub(76);
    }
    static void sum_sub(int a){
        int sum =0;
        int sub = 0;
        while (a>0){
            int rem = a%10;
            a = a/10;
            sum = sum+rem;
            sub = rem-sub;
        }
        System.out.println(sum);
        System.out.println(sub);
    }


    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //
    //You can return the answer in any order.


}
