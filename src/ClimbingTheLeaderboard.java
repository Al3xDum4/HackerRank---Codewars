import java.util.*;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>(Arrays.asList(100, 100, 50, 40, 40, 20, 10));
        List<Integer> player = new ArrayList<>(Arrays.asList(5, 25, 50, 120));

        System.out.println(climbingLeaderboard(ranked, player));

    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        Set<Integer> setList = new TreeSet<>(ranked).descendingSet();
        List<Integer> setLikeArray = new ArrayList<>(setList);

        for (int i = 0; i <= player.size() - 1; i++) {
            for (int j = setLikeArray.size() - 1; j > 0; j--) {
                int rank = setLikeArray.size();
                if (player.get(i) < setLikeArray.get(j)) {
                    rank = rank + 1;
                    results.add(rank);
                    setList.add(player.get(i));
                    break;
                } else if (player.get(i) == setLikeArray.get(j)) {
                    rank = j + 1;
                    results.add(rank);
                    setList.add(player.get(i));
                    break;
                } else if (player.get(i) > setLikeArray.get(j) && player.get(i) < setLikeArray.get(j - 1)) {
                    rank = j + 1;
                    results.add(rank);
                    setList.add(player.get(i));
                    break;
                } else if (player.get(i) > setLikeArray.get(0)) {
                    rank = 1;
                    results.add(rank);
                    setList.add(player.get(i));
                    break;
                }
            }
        }

        return results;
    }
}
