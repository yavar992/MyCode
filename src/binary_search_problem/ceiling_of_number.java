package binary_search_problem;
// find smallest letter greater than target
public class ceiling_of_number {
    public static void main(String[] args) {
   char [] ch = {'a','b','c','d','e'};
    char target = 'd';
  char c =  nextgretestletter(ch,target);
        System.out.println(c);

    }
    static char nextgretestletter(char[] letter, char target){
        int start = 0;
        int end = letter.length-1;
        while (start<end){

            int mid  = start+(end-start)/2;

              if (start==letter.length){
                  return 0;
              }
             if (target<letter[mid]){
                end = mid-1;
            }
            else start = mid + 1;

        }
        return letter[start%letter.length];
    }

}
