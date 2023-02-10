package oops.a.Exception_Handling;

public class problem2 {
    static int dividbyzero(int a , int b){
        int i = a/b;
        return i;
    }

    public static void main(String[] args) {
//        try {
//          int b =  dividbyzero(5,0);
//            System.out.println(b);
//        }catch (ArithmeticException ex){
//            System.out.println("bhai zero s divide mt kr");
//        }
//
        int []arr = new int[5];
        try{
            int i = arr[2];
            System.out.println(i);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("you are searching elemnt that is aukat k bahar of arr");
        } finally {
            System.out.println(" finally block");
        }
        int[] arr3 = {3,4,5,6,7,87,8};
        int[]arr4 = {2,3,4,0,8,56,6};

        for (int i = 0; i <arr3.length ; i++) {
            try {

                System.out.println(arr3[i] / arr4[i]);
            }catch (ArithmeticException ex){
                System.out.println("can't divide by zero");
            }
        }
    }
}
