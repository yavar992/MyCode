package revisee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class string {
    public static void main(String[] args) {
        // immutability

//
//        String name = "yavar";
//        System.out.println(name);
//
//        name = "ali khan";
//        System.out.println(name);
//
//        //  comparision of string
//        String a ="yavar";
//        String b= "yavar";
//        System.out.println(a==b);
//        String aa = new String("yavar");
//        String bb = new String("yavar");
//        System.out.println(aa==bb);
//        System.out.println(aa.equals(bb));
//      // prety printing
//        float num = 12.3434f;
//       // System.out.printf("formatted number is %.2f " , num);
//        //System.out.printf("pie: %.2f", Math.PI);
//       // for string
//        System.out.printf("my name is %s and i am %s", "yavar","cool");
//
//        // opertor
//        System.out.println("a" + 1);
//        System.out.println("yavar" + new ArrayList<>());
//            // perfoemance
//        String series = "";
//        for (int i = 0; i <26 ; i++) {
//            char ch = (char)('a'+i);
//            System.out.println(ch);
//        }
//
//        // string methods
        String myname = "yavar ali khan";
//        System.out.println(Arrays.toString(myname.toCharArray()));
//        System.out.println(myname.toUpperCase());
//        System.out.println(myname.replace('a','v'));
      //System.out.println(myname.substring('y'));
//        System.out.println(myname.indexOf('a'));
//        System.out.println("  yavar   ".strip());
//        System.out.println(Arrays.toString(myname.split("a")));
        String strr = "great personality";
        char [] cd = strr.toCharArray();
        int count = 0;
        for (int i = 0; i <cd.length ; i++) {
            for (int j=i+1; j<cd.length; j++){
                if (cd[i]==cd[j]){
                    count++;
                }
                if (count>1){
                    System.out.println(cd[i]);

                }
            }
        }

    }
}
