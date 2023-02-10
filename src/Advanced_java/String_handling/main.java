package Advanced_java.String_handling;

import java.util.StringTokenizer;

public class main {
    public static void main(String[] args) {
        // immutable string
        // concat method
        String fullname;
        String name = "yavar";
        fullname = name.concat(" ali khan");
        System.out.println(name);
        System.out.println(fullname);
        //substring'
        //ystem.out.println(name.substring(4));
        String nam1 = "hello my name is yavar ali khan";
        String actualname = nam1.replace("hello", "hey!");
        System.out.println(actualname);
        // string buffer class
        StringTokenizer ab = new StringTokenizer("23");
    }
}