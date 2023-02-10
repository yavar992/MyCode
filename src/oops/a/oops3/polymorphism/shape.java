package oops.a.oops3.polymorphism;

public class shape {
    void area(){
        System.out.println("i am in shape");
    }
}
class square extends shape{
    void area(){
        System.out.println("area of square is side * side");
    }
}
class circle extends shape{
    void area(){
        System.out.println("area of cicle is pie*r*r");
    }
}
class triangle extends shape {
    void area() {
        System.out.println("area of triangle is 0.2*b*h");
    }

    public static void main(String[] args) {
        shape circle = new circle();
        circle.area();
        triangle t1 = new triangle();
        t1.area();
        shape square = new square();
        square.area();
    }
}
