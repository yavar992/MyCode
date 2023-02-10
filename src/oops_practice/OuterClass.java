package oops_practice;

public class OuterClass {

    private int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public class InnerClass {
        public void printValue() {
            System.out.println("Value of x is: " + x);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printValue();
    }
}