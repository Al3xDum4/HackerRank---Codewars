import java.util.*;

public class ClosestNumbers {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(6,2,4,10));
        closestNumbers(num);

    }

    public static void closestNumbers(List<Integer> numbers){
        int min = 2;
        List<Integer> b = new ArrayList<>(numbers);
        Collections.sort(b);
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < b.size(); i++) {
            for (int j = i+1; j < b.size(); j++) {
                if(Math.abs(b.get(i) - b.get(j)) < min) {
                    min = Math.abs(b.get(i) - b.get(j));
                    Integer myPair[] = new Integer[]{b.get(i), b.get(j)};
                    list.add(myPair);
                } else if (Math.abs(b.get(i) - b.get(j)) == min) {
                    Integer myPair[] = new Integer[]{b.get(i), b.get(j)};
                    list.add(myPair);
                }
            }
        }
        for (Integer[] a: list) {
            Arrays.sort(a);
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
