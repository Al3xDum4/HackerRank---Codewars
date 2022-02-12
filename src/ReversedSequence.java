import java.util.Arrays;

public class ReversedSequence {
    public static void main(String[] args) {
        int a = 5;

        System.out.println(Arrays.toString(reverse(a)));
    }

    public static int[] reverse(int n){
        //your code
        int[] a = new int[n];
        int limit = n;
            for (int i = 0; i < a.length; i++) {
                a[i] = limit;
                limit--;
            }

        return a;
    }
}
