package YAVAR.array.firstsyllabus;

import java.util.Arrays;
import java.util.Locale;

public class string_split {
    public static void main(String[] args) {
        String sentence = "hello , i am yavar ali khan , and i come here from meerut";
        String[] new_sentence = null;
        new_sentence = sentence.split(",");
        System.out.println(new_sentence[0]);
        System.out.println(new_sentence[1]);
        System.out.println(new_sentence[2]);

        String hello = "i am yavar! i belong to delhi! i am student of jmi";
        String[] hi = null;
        hi = hello.split("!");
        System.out.println(hi[0]);
        System.out.println(hi[1]);
        System.out.println(hi[2]);

        //SUBSTRING
        //This method allows the programmer to extract substrings from given Strings, i.e., you can take out a part of an existing String as a new String. The method that allows this functionality is called substring, and it works in two ways. The code snippet below shows both ways of using this method.
        String choice = "coffeeortea";
        //substring a word ;
        //if we go from left to right it will tsk only one argument
        //and if we go to from right to left it will take two argument
        System.out.println(choice.substring(8));
        System.out.println(choice.substring(0,6));

        //uppercaee or lowercase
        String hii = " Hello";
        System.out.println(hii.toLowerCase());
        System.out.println(hii.toUpperCase());

        //  string length
        String yavar = "i am yavar ali khan";
        System.out.println(yavar.length());

        //concate with concate keyword
        String firstname = "yavar";
        String middlename = "ali";
        String lastname = "khan";
        System.out.println(firstname + " ".concat(middlename) + " ".concat(lastname));

        //There’s always some logic in whatever we do, whether it seems like that or not. This time, we are going to give you the logic, and all you need to do is implement it. The challenge is to create the expression explained below and find what result it gives!
        boolean x = true;
        boolean y = false;
        boolean answer;
        boolean not_x = !x;
        boolean xor = not_x ^ x;
        boolean and = y&&xor;
        answer = !y&&xor;
        System.out.println(answer);

    }
}
