package oops.a.Exception_Handling;

import java.util.Scanner;

public class PROBLEM3  extends  problem1{ }
    class  abcd {
        public static void main(String[] args) {
            try {

            } catch (Exception ex) {
            }
            Scanner s = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            try {
                sb.append(s.nextInt());
                // sb.append(s.nextInt());
                System.out.println(sb);
            } catch (Exception e) {
                System.out.println(e.getCause().getMessage());
            }
        }
    }