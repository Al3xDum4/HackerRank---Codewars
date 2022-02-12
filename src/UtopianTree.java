public class UtopianTree {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(utopianTree(n));
    }

    public static int utopianTree(int n) {
        // Write your code here
        int result = 1;
        for (int i = 0; i <= n; i++) {
            if ((i > 0) && (i % 2 != 0)) {
                result = result * 2;
            } else if ((i > 0) && (i % 2 == 0)) {
                result = result + 1;
            }
        }
        return result;
    }
}
