package YAVAR.array.firstsyllabus;

public class day4_practice {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter first number");
//        int num1 = sc.nextInt();
//        Scanner se = new Scanner(System.in);
//        System.out.println("enter seocnd number");
//        int num2 = se.nextInt();
//        Scanner sd = new Scanner(System.in);
//        System.out.println("enter third number");
//        int num3 = sd.nextInt();
//       int d = smallest(num1 , num2 , num3);
//        System.out.println("the smallest number is" +d);
//        int d = smalllest(12, 39, 34);
////        System.out.println(d);
//       int av = average(24,4,5);
//        System.out.println(av);
      int co =  count_vowel("w3resource");
        System.out.println(co);
   }
//
//    //    static int smallest(int a , int b , int c){
////        return Math.min(Math.min(a,b),c);
////    }
//    static int smalllest(int a, int b, int c) {
//        int max = a;
//        if (b > a) {
//            max = b;
//        } else {
//            max = c;
//        }
//        return max;
//    }
//    /// average of three number
//    static int average(int a, int b , int c){
//        int d = (a+b+c)/3;
//        return d;
//
//    }

    //write a java methods to counts th no of vowels in a strings
    static int count_vowel(String vowel) {
        int count = 0;
        for (int i = 0; i <= vowel.length(); i++) {
            if (vowel.charAt(i) == 'a' && vowel.charAt(i) == 'i' && vowel.charAt(i) == 'e' && vowel.charAt(i) == 'o' && vowel.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    }
