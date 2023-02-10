package revisee;

public class FUN2 {
    public static void main(String[] args) {
        int var = 22;
        int de;
        prime(11);

//     boolean se =   isarsmstrong(153);
//        System.out.println(se);
//

//        for (int i = 100; i <= 1000; i++) {
//            if (isarsmstrong(i)) {
//                System.out.println(i);
//            }
//

        // function block or scope
//        {
//            int a = 12;
//            var = 43;
//            System.out.println(var);
//            int c = 34;
//            System.out.println(c);
//        }
//        System.out.println(var);
//        int c = 54;
//        System.out.println(c)100;

        System.out.println();
        }
//


//    static int sum() {
//        int a = 10;
//        int b = 20;
//        int c = a + b;
//        return c;
//    }

    // chck whether a num is armstrong or not
    static boolean isarsmstrong(int no) {
        int original = no;
        int sum = 0;
        while (no > 0) {
            int rem = no % 10;
            no = no / 10;
            sum = sum + rem * rem * rem;
        }
        return sum==original;
    }

    static void prime(int no) {
        int count = 2;
        int temp = 0;
        while (no > 0) {
            if (no % 2 == 0) {
                temp = temp + 1;
            }
            count++;
        }

        if (temp == 1) {
            System.out.println("prime");
        }
        if (temp > 1) {
            System.out.println("not prim");
        }
    }
}
