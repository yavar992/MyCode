package oops.a.oops6;

public interface example7 {
    int twostudents(int name1 , int name2);
}
class lemdaexample7 {
    public static void main(String[] args) {


        example7 exp7 = ((name1, name2) -> (name1 + name2));
        {
            System.out.println(exp7.twostudents(12, 23));
            System.out.println(1/0);
        }

    }
}
