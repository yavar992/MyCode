package testing;

public class electrical extends car {
public final String drive(){
    return "driving electrical car";
}

    public static void main(String[] args) {
      final car car = new electrical();
      car.drive();
        System.out.println(car.drive());
    }

}
