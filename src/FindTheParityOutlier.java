import java.util.ArrayList;
import java.util.List;

public class FindTheParityOutlier {
    public static void main(String[] args) {
        int[] nn = {2, 4, 0, 100, 4, 11, 2602, 36};

        System.out.println(find(nn));

    }
        static int find(int[] integers) {
            List<Integer> a = new ArrayList<Integer>();
            List<Integer> b = new ArrayList<Integer>();
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 == 0) {
                    a.add(integers[i]);
                } else {
                    b.add(integers[i]);
                }
            }

            if (a.size() == 1) {
                return (a.get(0));
            } else {
                return b.get(0);
            }
        }
    }
