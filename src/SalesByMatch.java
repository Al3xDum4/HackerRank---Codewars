import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesByMatch {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int countPair = 0;
        List<Integer> countsList = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            int count = 0;
            for (int j = i; j < ar.length; j++) {
                if (ar[j] == ar[i]) {
                    count++;
                }
            }
            countsList.add(count);
        }

        for (int i = 0; i < countsList.size(); i++) {
            if (countsList.get(i) % 2 == 0) {
                countPair++;
            }
        }

        return countPair;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);

        scanner.close();
    }
}
