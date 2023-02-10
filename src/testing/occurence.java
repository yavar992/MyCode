package testing;

public class occurence {
    static int count_occurece(int [] arrr ,int target){
        int count = 0;
        for (int i = 0; i < arrr.length; i++) {
            if (arrr[i]==target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] numbers  = {1,2,2,2,2,24,4,4,45,5,6,7,8};
        int target=2;
        int nums =  count_occurece(numbers,target);
        System.out.println("the occurence of the "+target + " element is "+nums);
    }
}
