package revisee;

public class function {
    public static void main(String[] args) {
//        greeting();
//        int h = sum();
//        System.out.println(h);
//        String ss = name();
//        System.out.println(ss);
//        int gg = multiply(23, 5);
//        System.out.println(gg
//        );
//        int greatest = greatest(43, 23, 41);
//        System.out.println(greatest);
//        oddeven();
//        eligible();
////
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" first no :");
//        int frst = sc.nextInt();
//        System.out.println("second no :");
//        int scnd = sc.nextInt();
//        int sol = sum(frst,scnd);
//        System.out.println(sol);

//        for (int i=1; i<100; i++){
//            if (prime(i)){
//                System.out.println(i);
//            }

//        int sd = occurance(36533633);
//        System.out.println(sd);
//        String CHACHA = " BHOLU";
//        greey(CHACHA);
        prime(11);
       int gf =  lcm_hcf(9,18);
        System.out.println(gf);
    }



    //    static void greeting() {
//        System.out.println("hello");
//    }
//
//    static int sum() {
//        int a = 10;
//        int s = 20;
//        int d = a + s;
//        return d;
//    }
//
//    static String name() {
//        String sed = "hello everyone";
//        return sed;
//    }
//
//    static int multiply(int a, int b) {
//        int ded = a * b;
//        return ded;
//    }
//    // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
//
//    static int greatest(int a, int b, int c) {
//        int greatest = a;
//        if (greatest < b) {
//            greatest = b;
//        }
//        if (greatest < c) {
//            greatest = c;
//        }
//        return greatest;
//    }
//
//    //    Define a program to find out whether a given number is even or odd.
//    static void oddeven() {
//        int r = 11;
//        if (r % 2 == 0) {
//            System.out.println("even");
//        }
//        if (r % 2 == 1) {
//            System.out.println("odd");
//        }
//
//    }
////    A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
//
//    static void eligible() {
//        int age = 17;
//        if ((age > 18) && (age == 18)) {
//            System.out.println("u r eligible");
//        }
//        if (age < 18) {
//            System.out.println("u r not eligible");
//        }
//    }
////    Write a program to print the sum of two numbers entered by user by defining your own method.
//    static int sum(int a , int b){
//        int c = a+b;
//        return c;
//    }
//    Define a method that returns the product of two numbers entered by user.
    static String prime(int i) {
        int no = 11;
        int count = 2;
        int temp = 0;
        while (no > count * count) {
            if (no % count == 0) {
                temp++;
            }
            count++;
        }
        if (temp==1){
            return "prime";
        }
        if (temp>1){
            return "not prime";
        }
        return null;
    }


//        int n = 6;
//        int tempo =1;
//        for (int i =5; i>1; i--){
//            tempo = tempo*i;
//            System.out.println(tempo);
//        }

             // occurance of no

         static int occurance(int a){
        int temp =0;
        while (a>0){
            int rem = a%10;
            if (rem==3){
                temp++;
            }
            a = a/10;
        }
        return temp;
         }
         static void greey(String naam){
             System.out.println();
         }
     static int lcm_hcf(int a , int b){
        int gcd = 1;
        for (int i=1; i<=a; i++){
            if ((a%i==0) && (b%i==0)){
                gcd = gcd+1;
            }

        }
        return gcd;
     }
}

