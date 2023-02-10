package string;

public class intro {
    public static void main(String[] args) {
  int ans = 0;
  for (int i = 1; i*i <=20; i++){
      ans = ans + fun(3,2);
  }
        System.out.println(ans);
    }
    static int fun(int a ,int b){
        if (a-b>0){
            return a+b;
        }
        else {
            return a*b;
        }
    }
}
