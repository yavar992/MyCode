package oops.a.inheritence;

public class class_concept_oops1 {
    public static void main(String[] args) {
        int[] roll = new int[5];
        String[] name = new String[5];
        float[] manrks = new float[5];

        student[] students = new student[5];
        student yavar = new student();
        student aaftab = new student();
        System.out.println(yavar.marks);
        System.out.println(yavar.roll);
        System.out.println(yavar.name);
       // System.out.println(aaftab.roll);
        yavar.greeting();
    }
}
    class student{
        int roll;
        String name ;
        float marks;
     void  greeting(){
         System.out.println("hello my name is" + this.name);
       }
        student(){
            this.roll = 14;
            this.name = "yavar ali khan";
            this.marks = 99.32f;
        }
    }
    class test1{
    static void hello(){
        System.out.println("hey!");
    }
    }
    class  test2 extends test1{
    static void  hello(){
        System.out.println("hello");
        }

        public static void main(String[] args) {
            test2 t2 = new test2();
            test2.hello();
            test1.hello();
        }
    }

