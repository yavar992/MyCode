package oops.a.oops3;

public  class superkey_subclass extends superkay {
    String color = "black";
    void color(){
        System.out.println(super.color);
    }
    int n = 342;


    public static void main(String[] args) {
        superkey_subclass cutecat = new superkey_subclass();
        cutecat.color();
    }
}
