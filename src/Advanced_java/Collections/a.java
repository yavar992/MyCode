package Advanced_java.Collections;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

class a implements Comparable , Comparator {
private int roll_no;
private String student_name;
private String studnt_city;
    @Override
    public int compareTo(@NotNull Object o) {
        return this.roll_no;
    }
    @Override
    public int compare(Object o1, Object o2) {
        return -1;
    }
     public int getRoll_no() {
         return roll_no;
     }

     public String getStudent_name() {
         return student_name;
     }

     public String getStudnt_city() {
         return studnt_city;
     }

     public a(int roll_no, String student_name, String studnt_city) {
         this.roll_no = roll_no;
         this.student_name = student_name;
         this.studnt_city = studnt_city;
     }

     @Override
     public String toString() {
         return roll_no + " " + student_name + " " + studnt_city;
     }



}
