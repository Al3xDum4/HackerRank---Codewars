import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DesignerPdfViewer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for (int h_i = 0; h_i < n; h_i++) {
            h[h_i] = in.nextInt();
        }
        String word = in.next();

        System.out.println(designerPdfViewer(h, word));

    }

    public static int designerPdfViewer(int[] h, String word) {
        int max = 0;
        int len = word.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            map.put(ch, h[i]);
            i++;
        }

        for (int j = 0; j < len; j++) {
            int val = map.get(word.charAt(j));
            if (val > max) {
                max = val;
            }
        }
        return max * len;
    }
}
