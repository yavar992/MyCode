package YAVAR.array.firstsyllabus;

public class strng {
    public static void main(String[] args) {
        System.out.println("yavr ali khan");
        // string
        // sring literal---
        //String name = " hello my name\n is yavar ali khan";
        //Backspace	\b
        //Tab	\t
        //NULL character	\0
        //Newline	\n
        //Carriage Control	\r
        //Double Quote	\ "
        //Single Quote	\ ’
        //Backslash	\ \
      //  System.out.println(name);

        //immutability
        //Keep in mind that String objects are immutable, i.e, they cannot be modified once created. Hence, when a String object is modified, it is actually a new string that is being created. Hence, to save changes to the String, we must assign it to the new String. Look at the example below!

         String hi = "        hello everyone, there is a lion ";
         hi.trim();
         System.out.println(hi);
         hi = hi.trim();
         System.out.println(hi);

//         String bc = "     who the hell are you to come to my office";
//         bc.trim();
//         System.out.println(bc);
//         bc = bc.trim();
//         System.out.println(bc);
//
//         //concatenation
//        //Java provides special support for the concatenation of multiple Strings. Concatenation is referred to as the joining of two or more Strings. This is done by the use of the + operator. The code below shows an example of both.
//        String one = "hello ";
//        String two = "there is a worf";
//        int num = 45;
//        System.out.println(one + two);
//        //we can add anotger data type with string also;
//        System.out.println(one + " " + num);
//
//        //Comparing strings
//        //he String class has an in-built function called equals() for this operation. The method returns true if the two Strings are identical and false if they aren’t. The function is case-sensitive, as can be seen in the code snippet below.
//        String onee = " hello";
//        String twoo = "there";
//        String three = "Helllo";
//        String four = "there";
//
//        System.out.println(onee.equals(three));
//        System.out.println(twoo.equals(four));
//
//        // splitting a string
//        //This allows the programmer to split the String on the basis of a regular expression. This, in simple terms, means that the String will be split on a particular pattern that we can give to the split() function built into the String class. The function will return a String array with elements separated on the basis of the expression given. Let’s see how it works in the snippet below.
//        String SENTENCE = "HELLO , I AM YAVAR ALI KHAN , HOW ARE YOU ?";
    }
}
