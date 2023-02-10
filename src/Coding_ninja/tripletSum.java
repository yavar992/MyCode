package Coding_ninja;

public class tripletSum {
    static int countTripletsSumToX(int[] arr, int X) {
        int count = 0;
        for (int i = 0; i <arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==X){
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
     int[] array = {1,2,3,4,5,6,7};
     int x = 12;
     int ans = countTripletsSumToX(array,x);
        System.out.println(ans);
    }
}
