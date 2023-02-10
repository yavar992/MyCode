package interview_preperation;

public class occurance {
    static int occurance(int i,int occurence){
        int ans =0;
        while (i>0){
            int rem = i%10;
            if (occurence==rem){
                ans++;
            }
            i = i/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int i = 233442334;
        int occur =3;
        int ans = occurance(i,occur);
        System.out.println(ans);
    }

}
