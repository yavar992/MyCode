package oops.a.oops_question;

public class main {
    protected static void main(String[] args) {
        // Can we declare main() method as private or protected or with no access modifier in java?
        /// answer - yes it will compilw sucssfully but at the time of  executaion it will not run
        //ut, at the time of execution JVM does not consider this as the entry point of the program.
        // It searches for the main method which is public, static, with return type void, and a String array as an argument.
        System.out.println("hello");
    }
}
