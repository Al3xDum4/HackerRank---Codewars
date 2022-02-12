import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximizingXOR {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println(maximizingXor(a, b));
    }

    public static int maximizingXor(int l, int r) {
        // Write your code here
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                list.add((i | j) & (~i | ~j));
            }
        }

        return Collections.max(list);
    }
}
