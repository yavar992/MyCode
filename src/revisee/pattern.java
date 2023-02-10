package revisee;

public class pattern {
    public static void main(String[] args) {
//        int n =4;
//        pattern1(n);
//        int no = 4;
//        pattern2(no);
//        pattern3(n);
//        pattern4(5);
//        solidrectangle(4);
//        reverse_half_pyramid(4);
       //invert_half_pyramid(4);
       // adding_numberpattern(5);
        //halfpyramidinfromof0and1(5);
      //  halfpyramidinfromof0and1(5);
      //  rectangle(4);
      hollow_rectangle(4,5);
       // decrrasinghalfpyramid(5);
     //   reverse_number_half_reverse_pyramid(5);
        vertical_count(5);
        horizontal(5);
        //        single_number(5);
       // increment_number(5);
       // binary_number(5);
      //  rhombus(5);
       // practice(5);
       // pyramid(5);
       palindrome_pramid(5);
       // diamond(5);
      //  inverted_half_pyramid(5);
      //  diamond_pyramid(5);
      // half_pyramid(5);
       // pascal_traingle(5);
     //   hollow_rhombus(5);
       // reverse_halfpyrmid(5);

    }
    static void pattern1(int n){
        for (int rows = 1; rows <= n; rows++) {
            for (int cols =1; cols<=rows;cols++) {
              System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 1; i<=n; i++) {
            for (int j=0; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void solidrectangle(int n){
        for (int row = 1; row <=n; row++) {
            for (int cols=1;cols<=5; cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void reverse_half_pyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void invert_half_pyramid(int n){
        for (int row = 1; row <= n; row++) {
            for (int cols =1; cols<=n-row; cols++){
                System.out.print(" ");
            }

            for (int cols = 1; cols <=row; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // adding number pattern
    static void adding_numberpattern(int n){
        int ans = 1;
        for (int rows = 1; rows <=n ; rows++) {

            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(cols+ " ");
                ans++;
            }
            System.out.println();
        }
    }
    // reverse half number pyramid
    static void reevrse_halfnumber_pyramid(int n){
        for (int row = 1; row <=n ; row++) {
            for (int cols =1; cols<=n-row+1; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }
    // print half pyramid in form of 0 and 1
    static void halfpyramidinfromof0and1(int n){
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=rows ; cols++) {
                int sum = rows+cols;
                if (sum%2==0){
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
    // a ractangle of size 4*5
    static void rectangle(int n){
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 0; cols <n+1 ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /// print hollow rectangle
    static void hollow_rectangle(int n , int m){
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=m; cols++) {
                if (rows==1 || rows==n || cols==1 || cols==m){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    // decreasing half pyraind
    static void decrrasinghalfpyramid(int n){
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = rows; cols >=1 ; cols--) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
    // reverse number half reverse pyramind
    static void reverse_number_half_reverse_pyramid(int n){
        for (int rows = n; rows >=1 ; rows--) {
            for (int cols = rows; cols>=1 ; cols--) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }
    // vertical no column
    static void vertical_count(int n){
        for (int rows = 1; rows <=n ; rows++) {
            int ans =rows;
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(ans+" ");
                ans =ans+n-cols;
            }
            System.out.println();
        }
}

// horizontal no count
    static void horizontal(int n){
           int ans =0;
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=3; cols++) {
                ans = ans+1;
                System.out.print(ans+ " ");
            }
            System.out.println();
        }
    }
    // single number problem
    static void single_number(int n){
        for (int rows = 1; rows <=n; rows++) {
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(cols+ " ");
            }
            System.out.println();
        }
    }
    //Number Pattern Programs in Java
    static void increment_number(int n){
        for (int rows = 1; rows <=n; rows++) {
            int i=rows;
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(rows+ " ");
            }
            System.out.println();
        }
    }
    // binary numbr patttern
    static void binary_number(int n){
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols =1; cols <=n ; cols++) {
                int sum  = rows+cols;
                if (sum%2==0){
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }
            System.out.println();
        }

    }
    // rhombus
    static void rhombus(int n){
        for (int rows = 1; rows <=n ; rows++) {
            for (int cols = 1; cols <=n-rows ; cols++) {
                System.out.print("  ");
            }
            for (int cols = 1; cols <=n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //right half star pyramid
    static void practice(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // pyramid
    static void pyramid(int n){
        //outer loop
        for (int rows = 1; rows <=n ; rows++) {
            //print spaces
            for (int space = 1; space <n-rows ; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }
    // palindrome pyramind
    static void palindrome_pramid(int n){
        /// outer loop
        for (int rows = 1; rows <=n ; rows++) {
            ///print space
            for (int space = 1; space <=n-rows ; space++) {
                System.out.print(" ");
            }
            // for i to 1
            for (int cols = rows; cols>=1 ; cols--) {
                System.out.print(cols);
            }
            // for 2 to i
            for (int cols = 2; cols <=rows; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }
    //Diamond
    static void diamond(int n) {
        for (int i =1; i<=n ; i++) {
            //space
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <2*n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }

        // problems
    //1. print inveted half pyraid
    static void inverted_half_pyramid(int n){
        for (int i = n; i>=1 ; i--) {
            // space
            for (int space = 1; space <n-i ; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <=i ; cols++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    // 2. daimond pyramid
    static void diamond_pyramid(int n){
        //outer loop
        for (int rows = 1; rows <=n ; rows++) {
            //print spaces
            for (int space = 1; space <n-rows ; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
        //inverted half
        for (int rows = n; rows >=1 ; rows--) {
            //print spaces
            for (int space = 1; space <n-rows ; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <=rows ; cols++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }
    static void half_pyramid(int n) {
        //outer loop
        for (int rows = 1; rows <= n; rows++) {
            //print spaces
            for (int space = 1; space < n - rows; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
    //pascal traingle
    static void pascal_traingle(int n){

        for (int i = 1; i <=n ; i++) {
            //space
            int ans=1;
            for (int j = 1; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(ans);
                ans = ans+i;
            }
            System.out.println();
        }
    }
    //hollow rhombus
    static void hollow_rhombus(int n){
        for (int i =1; i <=n ; i++) {
            //for space
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("  ");
            }
            // for the firdt and last row
            if (i==1 || i==n)
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
                }
            else{
                for (int k = 1; k <=n ; k++) {
                    if (k==1 || k==n){
                        System.out.print("* ");
                    }
                    else System.out.print("  ");
                }

            }

            System.out.println();
        }
    }
    //*
    //**
    //***
    //****
    //*****
    //****
    //***
    //**
    //*
    // print this pattern
    static void reverse_halfpyrmid(int n){
        // i to n
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for n-i to 1
        for (int i = 1; i <=n ; i++) {
            for (int j = n-i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    }

