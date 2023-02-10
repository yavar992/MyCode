package Coding_ninja;

public class pairs {
    public static void main(String[] args) {
       int [] array = {2,3,4,8,6,9,10};
       int x = 12;
       int ans= pairs(array,x);
        System.out.println(ans);
    }
    static int pairs(int[]arr ,int x){
        int count = 0;
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }
}
