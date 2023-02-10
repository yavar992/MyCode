package oops.a.oop4;

public class acess_modifier {
   public int num;
    String name;
    int arr[];

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public acess_modifier(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[12];
    }
}
