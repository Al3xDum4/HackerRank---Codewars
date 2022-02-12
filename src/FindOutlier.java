import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOutlier {
    public static void main(String[] args) {
        int[] integers = {10,12,14,15,18};

        System.out.println(find(integers));
    }

    static int find(int[] integers){
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < integers.length; i++) {
            if(integers[i] % 2 == 0){
                evenList.add(integers[i]);
            } else {
                oddList.add(integers[i]);
            }
        }

        return evenList.size()==1 ? evenList.get(0) : oddList.get(0);

    }
}
