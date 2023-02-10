package oops.a.oops3;

public class inheritence {
    double l;
    double h;
    double w;
    double sum = l+h+w;


    inheritence() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    inheritence(double side) {
        super();
        this.l = side;
        this.w = side;
        this.h = side;
    }

    inheritence(double l, double h, double w) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    inheritence(inheritence old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    void working() {
        System.out.println("programm is working fine");
    }
       inheritence(double l , double h){
        this.l = l;
        this.h = h;
        double sum = l+h;
       }

    public static void main(String[] args) {
        inheritence i1 = new inheritence();
        System.out.println(i1.h);
        System.out.println(i1.l);
        System.out.println(i1.h);

        inheritence i2 = new inheritence(3);
        System.out.println(i2.l);
        System.out.println(i2.h);

        inheritence i3 = new inheritence(3, 3, 4);
        System.out.println(i3.l);
        i3.working();
        inheritence i4 = new inheritence(5,6);
    }
}
class namaste{
    int employeeid;
    String name;
    int salary;
    static String company_name;

    public namaste(int employeeid, String name, int salary) {
        this.employeeid = employeeid;
        this.name = name;
        this.salary = salary;
        namaste.company_name = "risingsuperech";
    }

    public static void main(String[] args) {
        boxweight r = new boxweight(2,3,3,3);
    }
}
