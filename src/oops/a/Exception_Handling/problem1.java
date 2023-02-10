package oops.a.Exception_Handling;

public class problem1 {
    public static void main(String[] args) {
//        int[]arr1 = {4,8,12,32,64};
//        int []arr2 = {2,0 ,4,8,12};
//        for (int i = 0; i <arr1.length ; i++) {
//         try{
//             System.out.println(arr1[i]/arr2[i]);
//         }
//         catch (ArithmeticException ex){
//             System.out.println(" you cannot divide anything with zero");
//         }
//          //  System.out.println(arr1[i]/arr2[i]);
//        }
//
//        arr2[3] = 23;
//        try{
//            System.out.println(arr1[11]);
//        }
//        catch (IndexOutOfBoundsException ex){
//            System.out.println("index is out of bounds");
//        }
        int a = 5;
        int b =0;
        try{
            System.out.println(a/b);
          //  throw new RuntimeException("don't divide by zero");
        }
        catch (ArithmeticException ex){
            System.out.println("don't divide by zero");
        }

        String name1 = null;
        try{
            System.out.println(name1.length());
        }
        catch (NullPointerException ex){
            System.out.println("string don't have size");
        }
    }
}
