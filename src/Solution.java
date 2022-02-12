import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    static int migratoryBirds(List<Integer> arr) {
        int countId1 = 0;
        int countId2 = 0;
        int countId3 = 0;
        int countId4 = 0;
        int countId5 = 0;

        for (int j = 0; j < arr.size(); j++) {
            if (arr.get(j) == 1) {
                countId1++;
            } else if (arr.get(j) == 2) {
                countId2++;
            } else if (arr.get(j) == 3) {
                countId3++;
            } else if (arr.get(j) == 4) {
                countId4++;
            } else {
                countId5++;
            }
        }

        ArrayList<Integer> countsList = new ArrayList<>();
        countsList.add(countId1);
        countsList.add(countId2);
        countsList.add(countId3);
        countsList.add(countId4);
        countsList.add(countId5);
        Collections.sort(countsList, Collections.reverseOrder());

        System.out.println(countsList);

        int result = 0;

        for (int i = 1; i < countsList.size(); i++) {
            if (countsList.get(i) < countsList.get(i - 1)) {
                if (countsList.get(i - 1) == countId1) {
                    result = 1;
                } else if (countsList.get(i - 1) == countId2) {
                    result = 2;
                } else if (countsList.get(i - 1) == countId3) {
                    result = 3;
                } else if (countsList.get(i - 1) == countId4) {
                    result = 4;
                } else {
                    result = 5;
                }
                break;
            } else if (countsList.get(i) == countsList.get(i - 1)) {
                if (countsList.get(i) == countId1) {
                    result = 1;
                } else if (countsList.get(i) == countId2) {
                    result = 2;
                } else if (countsList.get(i) == countId3) {
                    result = 3;
                } else {
                    result = 4;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = migratoryBirds(arr);
        System.out.println(result);

        bufferedReader.close();
    }
}
