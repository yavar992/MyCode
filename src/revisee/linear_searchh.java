package revisee;

import java.util.Arrays;

public class linear_searchh {
    public static void main(String[] args) {
        int[][]arrs = {
                {1,211,3,4},
                {43,34,32,3},
                {34,6,7,8}
        };
        int []candies = {1,5,7,4,2};
       //boolean[] de =  candies(candies);
      int max =  candies(candies);
        System.out.println(max);
       int ddd = maximum_wealth(arrs);
      //  System.out.println(ddd);
       // System.out.println(no_of_digit(-23233));
      int fej =  oddeven_element_in_2darray(arrs);
       // System.out.println(fej);
       int f = maxin_2darrray(arrs);
       // System.out.println(f);

        int target = 43;
      int[]fe =  searchin_2darray(arrs,target);
        //System.out.println(Arrays.toString(fe));

        int[] arr = {232, 3222, 14, 5, 65, 712, 1723,-3};

       int as = findnumber(arr);// System.out.println(as);
      int df =  findoddnumber(arr);
        System.out.println(df);

        int sds = smallet(arr);
       // System.out.println(sds);
     int fd =     linear_search_inange(arr,32,1,5);
       // System.out.println(fd);
       // int target = -1;
        int d = linear_search(arr, target);
       // System.out.println(d);
        int[] arrr = {23, 32, 14, 5, 6, 7, 17, 35,-1,-2,-3,-4};
        int targett = 322;
      //  System.out.println(linear_search2(arrr,targett));
        String[] name = {"yavar" ,"ali","khan","saddy" };
        String target_element = "ali";
       boolean j = search_string(name,target_element);
      //  System.out.println(j);
        String naam = "yavar";
        char search = 'v';
     boolean e=   findchar(naam,search);
        //  System.out.println(e);
//
//        int[]are = {12,3,43,4,23,4,2,432,3};
//        System.out.println("even numbwers");
//        for (int i = 0; i <are.length ; i++) {
//            if (are[i] % 2 == 0) {
//
//                System.out.println(are[i] + " ");
//            }
//        }
//        System.out.println("odd number");
//        for (int i = 0; i <are.length ; i++) {
//            if (are[i]%2!=0){
//                System.out.println(are[i]);
//            }
//        }

    }

    static int linear_search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target)
                return index;
        }
        return -1;
    }

    // return true or false if element is exis or not
    static boolean linear_search2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }

        }
        return false;
    }
    // search in string
    static boolean search_string(String[] name , String target){
        if (name.length==0){
            return false;
        }
        for (int i = 0; i <name.length ; i++) {
            String element = name[i];
            if (element==target){
                return true;
            }
        }
        return false;
    }
    // find character in a string
    static boolean findchar(String naam , char ch){
        if (naam.length()==0){
            return false;
        }
        for (int i = 0; i <naam.length() ; i++) {
            char element = naam.charAt(i);
            if (ch == element){
                return true;
            }
        }
        return false;
    }

    /// by for each loop
    static boolean findcharter(String naam , char ch){
        if (naam.length()==0){
            return false;
        }
        int target;
        for (char c:naam.toCharArray()) {
            if (c == ch){
                return true;
            }

        }
        return false;
    }
    // search in range
    static int linear_search_inange(int[] arr, int target,int start ,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <end; index++) {
            int element = arr[index];
            if (element == target)
                return index;
        }
        return -1;
    }
    // minimum numbr
    static int smallet(int[]arr){
        int smallest = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (smallest>arr[i]){
                smallest= arr[i];
            }
        }
        return smallest;
    }

    // search in 2d array
    static int[] searchin_2darray(int[][]arr , int target){

        for (int i = 0; i <arr.length ; i++) {
            for(int j=0; j<arr[i].length; j++){
                int element = arr[i][j];
                if (element==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }


    static int maxin_2darrray(int[][]arr){
       int maximum = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[i].length; j++){
                if (arr[i][j]>maximum){
                    maximum = arr[i][j];
                }
            }
        }
        return maximum;
    }
    // find even  number from array
   static int findnumber(int[]arr){
        int counter= 0;
//
       for (int num:arr) {
           if (even(num)){
               counter++;
       }
       }
//       for (int i = 0; i <arr.length ; i++) {
//          if (even(i)){
//              return counter++;
//          }
//       }
       return counter;
   }

   static int no_of_digit(int num){
     int   count =0;
     if (num<0){
         num = num*-1;
     }
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
   }
   static boolean even(int num){
        if (no_of_digit(num)%2==0){
            return true;
        }
        return false;
   }

    static int findoddnumber(int[]arr){
        int counter= 0;
        for (int s:arr) {
            if (odd(s)){
                counter++;
            }
        }
        return counter;
    }

    static int oddno_of_digit(int num){
        int   count =0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }
    static boolean odd(int num){
        if (no_of_digit(num)%2==1){
            return true;
        }
        return false;
    }


    // frequency of odd and even number of element in a array
    static int oddeven_element_in_2darray(int [][]arr){
        int even_counter =0;
        int odd_counter =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[i].length; j++){
                if (arr[i][j]%2==0){
                   return even_counter++;
                }
                if (arr[i][j]%2!=0){
                    return odd_counter++;
                }
            }
        }
        return -1;
    }
    static int maximum_wealth(int[][]arr){
        int sum =0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            for (int j=0;j<arr[i].length; j++){
                sum = sum+arr[i][j];
            }
            if (sum>ans){
                ans = sum;
            }
        }
        return sum;
    }
    //1431. Kids With the Greatest Number of Candies
    static int candies(int[]arr){
        int extracandies = 3;
        int max_candies = arr[0];
        int no_of_candies_after_giving_extra_candies =0;
        for (int i = 0; i <arr.length ; i++) {
            no_of_candies_after_giving_extra_candies = extracandies+arr[i];
            if (max_candies<no_of_candies_after_giving_extra_candies){
              //  max_candies = no_of_candies_after_giving_extra_candies;
                return max_candies;
            }
        }
        return -1;
    }

}