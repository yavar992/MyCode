package oops.a.oops6;

public interface expirement5 {
    int sum(int a , int b);
}
class lemdaexirement5 {
    expirement5 exp5 = ((a, b) -> (a + b));

    {
        System.out.println(exp5.sum(3, 4));

    }
}
