package oops_practice;

public class superkeyword {
    String color;
}
class dog{
    String color = "white";
}
class cat extends dog{
    String color = "white";
    void printcolor(){
        System.out.println(color);
        System.out.println(super.color);
    }

    public static void main(String[] args) {
        dog tommy = new cat();
        System.out.println(tommy.color);
    }
}
