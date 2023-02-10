package oops.a.oops5;

public interface nested_interfaces {
  //  void show();
    interface nested_int{
        void display();
    }
}
class acessing implements nested_interfaces.nested_int{

    @Override
    public void display() {
        System.out.println("nicee!");
    }

    public static void main(String[] args) {
        acessing ab = new acessing();
        ab.display();
    }
}
