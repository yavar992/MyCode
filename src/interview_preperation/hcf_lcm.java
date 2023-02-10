package interview_preperation;

public class hcf_lcm {
    static int hcf(int a , int b){
        int hcf =0;
        for (int i = 1; i <=a && i<=b; i++) {
            if (a%i==0 && b%i==0){
               hcf = i;
            }
        }
        return hcf;
    }

    public static void main(String[] args) {
        int a  = 36;
        int b = 120;
        int ans = hcf(a,b);
        System.out.println(ans);
        int lcm = a*b/hcf(a,b);
        System.out.println(lcm);
    }

}
