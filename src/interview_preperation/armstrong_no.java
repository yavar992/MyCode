package interview_preperation;

public class armstrong_no {
    public static void main(String[] args) {
        int no = 371;
        boolean ans =         armstrong(no);
        System.out.println(ans);
        for (int i = 0; i <1000 ; i++) {
            if (armstrong(i)){
                System.out.println(i);
            }
        }
        {

        }
    }
    static boolean armstrong(int no){
       int ans = 0;
       int original =no;
       while (no>0){
           int rem = no%10;
           no = no/10;
           ans = ans+rem*rem*rem;
       }
       if (original==ans){
           return true;
       }
       else return false;
    }

}
