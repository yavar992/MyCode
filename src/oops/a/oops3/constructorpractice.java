package oops.a.oops3;

public class constructorpractice {
    static class pr {
        int a;
        String name;
        int marks;


        pr(){

        }
        pr(int a ,String name , int marks){
            this.a = a;
            this.name = name;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return name;
        }

        pr(pr old){
           this.name = old.name;
           this.a = old.a;
           this.marks = old.marks;
        }
    }


    public static void main(String[] args) {
        pr p1 = new pr();
        System.out.println(p1.marks); // default constructor
        System.out.println(p1.a);
        System.out.println(p1.name);

        pr p2 = new pr(12,"hello",345); // parameterized constructor
        System.out.println(p2);

        pr p3 = new pr(1,"hi",322);
        System.out.println(p3.a);
        System.out.println(p3.name);
        System.out.println(p3.marks);
    }
}
class abcd{
    float a;
    String sub="math";
    int roll;

    abcd(){
     this.sub = "science";
     this.roll = 23;
     this.a = 12;
    }
    abcd(float ab , String subject , int rollno){
        this.a = ab;
        this.roll = rollno;
        this.sub = subject;
    }
    abcd(String sub , int roll){
        this.sub =sub;
        this.roll =roll;
    }
    abcd(abcd old){
        this.sub = old.sub;
        this.roll = old.roll;
    }

    public static void main(String[] args) {

        abcd a = new abcd();
        System.out.println(a.sub);
        System.out.println(a.roll);
        abcd b = new abcd(23,"english",45);
        System.out.println(b.sub);

    }
}

class ab{
    public ab(int no, String name) {
        this.no = no;
        this.name = name;
        ab.compamy_name="xyz";
    }

    int no;
    String name;
    static String compamy_name;

    public static void main(String[] args) {
        ab s = new ab(1,"sivam");
        System.out.println(s.name);
        System.out.println(ab.compamy_name);
    }
}
