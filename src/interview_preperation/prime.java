package interview_preperation;

public class prime {
    static void prime(int no) {
        if (no == 1) {
            System.out.println("nor prime nor composite");
        }
        int count = 2;
        int temp = 0;
        while (no >= count) {
            if (no % count == 0) {
                temp = temp + 1;
            }
            count++;
        }
        if (temp==1){
            System.out.println("prime");
        }
        else System.out.println("not prime");
    }

    public static void main(String[] args) {
        prime(13);
    }
}
