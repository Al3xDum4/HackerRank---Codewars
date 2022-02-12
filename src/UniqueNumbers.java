import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumbers {
    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
        //ist<Integer> list = numbers.stream().filter(a -> Collections.frequency(numbers,a) ==1).collect(Collectors.toList());
        List<Integer> list = new ArrayList<>();

        for (Integer i : numbers) {
            if (Collections.frequency(numbers, i) == 1) {
                list.add(i);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }
}
