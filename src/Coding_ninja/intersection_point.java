package Coding_ninja;

public class intersection_point {
    public static void main(String[] args) {
        int[]array1 = {2,3,4,64,34,45};
        int[]array2 = {34,42,43,22,35,76};
        int answer = intersection(array1,array2);
        System.out.println(answer);
    }
    static int intersection(int[]array1 , int[]array2){
        for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j <array2.length; j++) {
                if (array1[i]==array2[j]){
                    return array1[i];
                }
            }
        }
        return -1;
    }
}
