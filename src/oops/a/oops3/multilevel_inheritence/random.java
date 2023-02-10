package oops.a.oops3.multilevel_inheritence;

public class random{
    int empid;
    String name;
    int salary;
    random(){
        this.empid = -1;
        this.salary =-1;
        this.name = "xyz";
    }

    public random(int empid, String name, int salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }
}
class random2 extends random{
    boolean married;

    public random2(boolean married) {
        this.married = married;
    }
    random2(){

    }

    public random2(int empid, String name, int salary, boolean married) {
        super(empid, name, salary);
        this.married = married;
    }
}
class random3 extends random2{
    static String company = "zyro";

    public random3(int empid, String name, int salary, boolean married) {
        super(empid, name, salary, married);
        random3.company = "xyz";
    }
    public random3() {

    }

    public static void main(String[] args) {
        random3 r1 = new random3(123,"yavar",45000,false);
        System.out.println(company);
        System.out.println(r1.name);
        random2 de = new random2();
        System.out.println(de);
    }
}
