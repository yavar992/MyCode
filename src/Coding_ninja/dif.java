package Coding_ninja;

public class dif {
    public static void populateArray(int[] ARR, int N) {
        int index = 0;

        // Populate even numbers in ascending order
        for (int i = 1; i <= N; i += 2)
              i = ARR[index++];

        // Populate odd numbers in descending order
        for (int i = N; i >= 1; i -= 2)
            i = ARR[index++];
    }

    public static void main(String[] args) {

    }
}
