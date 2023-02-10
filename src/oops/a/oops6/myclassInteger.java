package oops.a.oops6;
// here the problem is arising is that we have to make the constrcutor or method for every type of object we r making
// so , in order to resolve this problem we use generics


public class myclassInteger {
    Integer i;

    public myclassInteger(Integer i) {
        this.i = i;
    }
    void myclass(){
        System.out.println(i);
    }
}
