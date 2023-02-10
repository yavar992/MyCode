package testing;

public class string_occurence {
    static int string_occrence(String haystack, String needle){
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack = "yavar";
        String needle = "var";

      int indexof =  string_occrence(haystack,needle);
        System.out.println(indexof);
    }
}
