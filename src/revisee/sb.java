package revisee;

public class sb {
    public static void main(String[] args) {
//        StringBuilder build = new StringBuilder("yavar");
//        //System.out.println(build);
//        // System.out.println(build.append(5));
//        // System.out.println(build.append("ali khan"));
//        // System.out.println(build.delete(1,2));
//        System.out.println(build.deleteCharAt(2));
//        System.out.println(build.reverse());
//        build.setCharAt(1, 'd');
//        System.out.println(build);
//        // System.out.println(build.insert(0,'s'));
//        System.out.println(build.delete(2, 4));
//
//        StringBuilder name = new StringBuilder("yavar");
//        System.out.println(name.reverse());
//
//        for (int i = 0; i < name.length() / 2; i++) {
//            int start = name.charAt(0);
//            int end = name.charAt(name.length() - 1 - i);
//
//            // char frontchar =  name.setCharAt(front);
//            //char endchar = name.setCharAt(end,start);
//        }
//        String[] a = {"ab", "c"};
//        String[] b = {"a", "bc"};
//        StringBuilder reverse = new StringBuilder("yavar");
//        String ans = "";
//        for (int i = reverse.length() - 1; i >= 0; i--) {
//            ans = ans + reverse.charAt(i);
//        }
//        System.out.println(ans);

            String str1 = "Maximum and Minimum";
            int count;
            System.out.println("The entered string is: " + str1);
            //Converts given string into character array
            char str[] = str1.toCharArray();

            System.out.println("Duplicate characters in a given string: ");
            //Count the frequency of each character present in the string
            for (int i = 0; i < str.length; i++) {

                count = 1;
                for (int j = i + 1; j < str.length; j++) {
                    if (str[i] == str[j] && str[i] != ' ') {
                        count++;
                        //Set string[j] to 0 to avoid printing visited character
                        str[j] = '0';
                    }
                }
                //A character is considered as duplicate if count is greater than 1
                if (count > 1 && str[i] != '0') {
                    System.out.println(str[i]);


                }
            }
        }
    }