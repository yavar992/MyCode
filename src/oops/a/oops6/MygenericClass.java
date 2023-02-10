package oops.a.oops6;

public class MygenericClass<T> {
    T obj;
    void add(T t){
        this.obj = t;
    }

    public MygenericClass(T obj) {
        this.obj = obj;
    }
    T get(){
        return obj;
    }

    public T get(T i) {
        return obj;
    }

    @Override
    public String toString() {
        return "MygenericClass{" +
                "obj=" + obj +
                '}';
    }
    void show(T t1){
        System.out.println(obj.getClass());
    }
}
