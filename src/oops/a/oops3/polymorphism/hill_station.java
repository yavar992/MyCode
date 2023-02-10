package oops.a.oops3.polymorphism;

public class  hill_station {
    void location(){
        System.out.println("locatiion is :");
    }
    void famousfor(){
        System.out.println("famous for");
    }
}
class simla extends hill_station {
    void location() {
        System.out.println("shimla is in himachal pradesh");
    }

    void famousfor() {
        System.out.println("it is famous for adventure ice sport");
    }
}
class laddaq extends hill_station{
    void location(){
        System.out.println("laddaq is in kashmir");
    }
    void famousfor(){
        System.out.println("it is famous for its beautiful and ice covered mountain");
    }

    public static void main(String[] args) {
        hill_station manali = new hill_station(); // creating new objct for parent class
        hill_station shimla = new simla();// upcasting
        hill_station laddaq = new laddaq();

        shimla.famousfor();
        shimla.location();
        laddaq.location();
        laddaq.famousfor();

    }
}
