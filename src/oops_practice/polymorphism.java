package oops_practice;

public class polymorphism {
   int id;
   String name;

    public polymorphism(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class emp extends polymorphism{
    float salary;

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    public emp(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    public static void main(String[] args) {
        emp e1 = new emp(1,"rahul",23000);
        System.out.println(e1);
    }
}

