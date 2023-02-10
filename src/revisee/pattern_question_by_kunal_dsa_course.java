package revisee;

public class pattern_question_by_kunal_dsa_course {
    public static void main(String[] args) {
        // question1(5);
        //question2(5);
        //question3(5);
        // question4(5);
        //  question5(5);
        //   question6(5);
        //  question7(5);
        //question8(5);
        //question9(5);
        //   question10(5);
        // question11(5);
        //  question12(5);
        //   right_angle_hollow_traingle(5);
        //  left_angled_triangle(5);
        //hollow_traingle(5);
        //  fullpyramid(5);
        // hollow_pyramid(5);
        // rverse_pyrmid(5);
        //rverse_hollow_pyrmid(5);
        //  hollow_diamond(5);
        //palindeomic_pattern(5);
        // hollow_rectangle(5,5);
         //question21(5);
        // horizontal_increment(5);
       // hollow_rhombus(5);
       // question26(5);
       // rhombus(5);
        //first_character_pattern(5);
      //  ded(5);
      //  rerverse_alphabat(5);
     //   adding_alphabat(5);
       // adding_alphabat(5);
        //sample(5);
       butterfly_pattern(4);
     //   butterfly_half_reverse(4);
    }

    /*
    question no 1
     *****
     *****
     *****
     *****
     *****

     */
    static void question1(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    question no 2
    *
    **
    ***
    ****
    *****
     */
    static void question2(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    question no 3
    *****
    ****
    ***
    **
    *
     */
    static void question3(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = n - rows + 1; cols >= 1; cols--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    question 4
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */
    static void question4(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }

    /*
    question n0 5
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
     */
    static void question5(int n) {
        // for i to n
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for n-i to 1
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = n - rows; cols >= 1; cols--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    question no 6
         *
        **
       ***
      ****
     *****
     */
    // in this question we r printing from right so we need to add space as well
    static void question6(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int space = 1; space <= n - rows; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *****
     ****
     ***
     **
     *

     * reverse of question 6
     */
    static void question7(int n) {
        for (int rows = n; rows >= 1; rows--) {
            // space
            for (int space = n - rows; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
      *
     ***
    *****
   *******
  *********
question 8
     */
    static void question8(int n) {
        for (int rows = 1; rows <= n; rows++) {
            // for space
            for (int space = 1; space <= n - rows; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= 2 * rows - 1; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    question no 9
    *********
     *******
      *****
       ***
        *
     */
    static void question9(int n) {
        for (int rows = n; rows >= 1; rows--) {
            for (int space = n - rows; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= 2 * rows - 1; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    questin 10
         *
        * *
       * * *
      * * * *
     * * * * *
     */
    static void question10(int n) {
        for (int rows = 1; rows <= n; rows++) {
            // for space
            for (int space = 1; space <= n - rows; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    static void question11(int n) {
        for (int rows = n; rows >= 1; rows--) {
            // for space
            for (int space = n - rows; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
    question 12
     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
     */
    static void question12(int n) {
        ///uppar half
        for (int rows = n; rows >= 1; rows--) {
            // for space
            for (int space = n - rows; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // lower half
        for (int rows = 1; rows <= n; rows++) {
            // for space
            for (int space = 1; space <= n - rows; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /*
    hollow right angle triangle
       question 13
     */
    static void right_angle_hollow_traingle(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                if (rows == n || cols == 1 || cols == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // left anle hollow triangle
    static void left_angled_triangle(int n) {
        for (int rows = n; rows >= 1; rows--) {
            for (int cols = 1; cols <= rows; cols++) {
                if (rows == n || cols == 1 || cols == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // hollow triangle
    static void hollow_traingle(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                if (rows == n || cols == 1 || cols == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int rows = n; rows >= 1; rows--) {
            for (int cols = 2; cols <= rows; cols++) {
                if (rows == n || cols == 1 || cols == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    // full pyramid
    static void fullpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            // for left part n to i
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            // for right part 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // hollow pyramid
    static void hollow_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
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

    /*
    reverse hollow pyramid
     *********
      *     *
       *   *
        * *
         *
     */
    static void rverse_pyrmid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // 1st reverse inverted part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for second reveeted part
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // reverse hollow pyramid
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

    static void hollow_diamond(int n) {
        // lower half
        for (int rows = 1; rows <= n; rows++) {
            // for space
            for (int space = 1; space <= n - rows; space++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // upparhalf
        for (int rows = n; rows >= 1; rows--) {
            // for space
            for (int space = n - rows; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int cols = 2; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    /*
        1
        212
       32123
      4321234
       32123
        212
         1
palindromic pattern
     */
    static void palindeomic_pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            // for left part n to i
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // for right part 2 to i
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    // hollow rectangle
    static void hollow_rectangle(int n, int m) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /*
    question no 21
   1
   2  3
   4  5  6
   7  8  9  10
   11 12 13 14 15
     */
    static void question21(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    /*
    question no 22
    horizontal increment
     */
    static void horizontal_increment(int n) {
        for (int i = 1; i <= n; i++) {
            int ans = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(ans + " ");
                ans = ans + i;
            }
            System.out.println();
        }
    }

    // hollow rhombus
    static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");

                }
            }
            else {


                    for (int j = 1; j <= n; j++) {
                        if (j == 1 || j == n) {
                            System.out.print("*");
                        } else System.out.print(" ");
                    }
                    System.out.println();
                }

            }
        }
        /*
        question no 26
         1 1 1 1 1 1
         2 2 2 2 2
         3 3 3 3
         4 4 4
         5 5
         6
         */
    static void question26(int n){
        for (int i = 5; i>=1 ; i--) {
            int ans = n-i+1;
            for (int j = 1; j <=i ; j++) {

                System.out.print(ans);

            }
            System.out.println();
        }
    }

    // print rhombus
    static void rhombus(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*

32.    E
       D E
       C D E
       B C D E
       A B C D E

     */
    static void ded(int n){
        for (int i =1;i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i =n-1; i>=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

static void first_character_pattern(int n){
    for (int i = 1; i<=n; i++) {
        for (int j = 1; j<=i ; j++) {
            System.out.print((char)(j+64));
        }
        System.out.println();
    }
}
//reverse alpabat
    static void rerverse_alphabat(int n){
        for (int i =1; i<=n ; i++) {
            for (int j =n-i+1; j>=1 ; j--) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    //addig alphabat
    static void adding_alphabat(int n){
        int count =1;
        for (int i =1; i<=n ; i++) {
            for (int j =1; j<=i ; j++) {
                int sum = i+j;
                if (sum%2==0){
                    System.out.print((char)(count+96)+" " );
                    count++;
                }
                else {
                    System.out.print((char)(count+64)+" ");
                    count++;
                }

            }
            System.out.println();
        }
    }
    // sample
    static void sample(int n){
        for (int i = 1; i<=n ; i++) {
            for (int j =n-i+1; j >=1; j--) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }


    static void butterfly_pattern(int n){
        for (int i =1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j =
            1; j <=(n-i)*2 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j =n-i; j>=1 ; j--) {
                System.out.print("*");
            }
            for (int space = 1; space <=2*i ; space++) {
                System.out.print(" ");
            }
            for (int j = n-i; j>=1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    //butterfly half reverse
    static void butterfly_half_reverse(int n) {
        for (int i = 1; i <=n ; i++) {
            for (int j =n-i; j>=1 ; j--) {
                System.out.print("*");
            }
            for (int space = 1; space <=2*i ; space++) {
                System.out.print(" ");
            }
            for (int j = n-i; j>=1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }



