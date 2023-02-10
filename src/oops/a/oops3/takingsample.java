package oops.a.oops3;

public class takingsample extends namaste{

    public takingsample(int employeeid, String name, int salary) {
        super(employeeid, name, salary);
    }
   void progress(){
       System.out.println(this.name + "have make progress of 50% in recent 2 year");
   }
    public static void main(String[] args) {
        takingsample no1 = new takingsample(201902766 ,"ravikumar",45000);
        System.out.println(no1.salary);
        System.out.println(company_name);
        System.out.println("this employee " + no1.employeeid + " named " + no1.name + " have salary of " + no1.salary + " in the " + company_name + " company");
         no1.progress();
    }
}
