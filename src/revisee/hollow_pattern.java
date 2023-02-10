package revisee;

public class hollow_pattern {
    public static void main(String[] args) {
      //  rverse_pyrmid(5);
       // rverse_hollow_pyrmid(5);
        hollow_pyramid(5);
    }
    static void rverse_pyrmid(int n){
        for (int i = n; i>=1 ; i--) {
            for (int j =n-i; j>=1; j--) {
                System.out.print(" ");
            }
            // 1st reverse inverted part
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            // for second reveeted part
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void hollows_pyramid(int n){
        for (int i = 1; i <=n ; i++) {
            for (int space = 1; space <=n-i ; space++) {
                System.out.print(" ");
            }
            // for left part n to i
            for (int j =i; j>=1 ; j--) {
                if (i==n || j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            // for right part 2 to i
            for (int j = 2; j <=i ; j++) {
                if (i==n || j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    static void rverse_hollow_pyrmid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int space = n - i; space >= 1; space--) {
                System.out.print(" ");
            }
            // for left part n to i
            for (int j = i; j >= 1; j--) {
                if (i == n || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // for right part 2 to i
            for (int j = 2; j <= i; j++) {
                if (i == n || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
        // hollow diamond
    static void hollow_pyramid(int n){
        for (int i = 1; i <=n ; i++) {
            for (int space = 1; space <=n-i ; space++) {
                System.out.print(" ");
            }
            // for left part n to i
            for (int j =i; j>=1 ; j--) {
                if ( j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            // for right part 2 to i
            for (int j = 2; j <=i ; j++) {
                if (j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--) {
            for (int space =n-i; space>=1 ; space--) {
                System.out.print(" ");
            }
            // for left part n to i
            for (int j =i; j>=1 ; j--) {
                if (j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            // for right part 2 to i
            for (int j = 2; j <=i ; j++) {
                if ( j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }

    }





