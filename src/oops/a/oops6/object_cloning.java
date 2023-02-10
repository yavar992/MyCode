package oops.a.oops6;

import java.util.Arrays;

public class object_cloning implements Cloneable {
    int age;
    String name;
    int[] arr;

    public object_cloning(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5};

    }
//    public object_cloning(object_cloning other){
//        this.age = other.age;
//        this.name = other.name;
//    }
    @Override
    public Object clone() throws CloneNotSupportedException{
return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        object_cloning anyone = new object_cloning(20,"yavar");
        //object_cloning b = a;
        object_cloning yavar = (object_cloning) anyone.clone();
        System.out.println(yavar.name + " " + yavar.age);
        System.out.println(Arrays.toString(yavar.arr));
         yavar.arr[0] = 100;
        System.out.println(Arrays.toString(anyone.arr));
    }
}
