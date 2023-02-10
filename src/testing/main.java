package testing;

public class main {
    int i = 20;

    public main(int j) {
        System.out.println(i);
        this.i = j*10;

    }
}


class main1 extends main{

    public main1(int j) {
        super(j);
        System.out.println(i);
        this.i=j*10;
    }

    public static void main(String[] args) {
     final main n = new main(20);
        System.out.println(n.i);
    }

}
