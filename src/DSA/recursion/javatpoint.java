package DSA.recursion;

public class javatpoint{
        static int count=0;
        static void p(){
                count++;
                if(count<=5){
                        System.out.println("hello "+count);
                        p();
                }
        }
        public static void main(String[] args) {
                p();
                printno(5);
        }
        static void printno(int n){
                System.out.println(n);
                if (n==0){
                        return;
                }
                printno(n-1);
        }

}
