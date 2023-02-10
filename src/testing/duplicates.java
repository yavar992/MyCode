package testing;

public class duplicates {
    static int duplicates(int[]array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                if (array[i]==array[j]){
                    int ans =0;
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arrray = {1,2,2,3,4,4,5,7};
       int duplicaytes =  duplicates(arrray);
        System.out.println(duplicaytes);
    }
}
