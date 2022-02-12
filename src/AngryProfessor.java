import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AngryProfessor {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, -1, 2, 1));
        int n = 2;

        System.out.println(angryProfessor(n, list));
    }

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        String result = "NO";
        int count = 0;
        for (Integer b : a) {
            if (b <= 0) {
                count++;
            }
        }

        if (count < k) {
            result = "YES";
        }
        return result;
    }
}
