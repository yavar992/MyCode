package oops_practice;

public class animal_sup_key {
    void eat(){
        System.out.println("eating..");
    }
}
class Dog extends animal_sup_key{
    void barks(){
        System.out.println("barks..");
    }
    void eat(){
        System.out.println("eating breads");
    }
    void works(){
        barks();
        super.eat();
    }

    public static void main(String[] args) {
        Dog husky = new Dog();
        husky.eat();
    }
}
