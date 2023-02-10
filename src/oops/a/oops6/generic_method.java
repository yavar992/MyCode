package oops.a.oops6;

public class generic_method {
    //Like the generic class, we can create a generic method that can accept any type of arguments. Here, the scope of arguments is limited to the method where it is declared. It allows static as well as non-static methods.
    public static <E> void printarray(E[] elements){
        for(E element : elements){
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6};
        String[] arr2 = {"hello", "guys" , "i " ,"am"};
        printarray(arr);
        printarray(arr2);
    }
}
