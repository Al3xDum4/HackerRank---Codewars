import java.util.*;

public class Gemstones {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abcdde", "baccd", "eeabg");
        System.out.println(gemstones(list));
    }

    public static int gemstones(List<String> arr) {
        int result;
        String strResult = "";
        Set<String> setOfChar = new HashSet<>();


        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).length(); j++) {
                setOfChar.add(String.valueOf(arr.get(i).charAt(j)));
            }
        }

        List<String> listOfChar = new ArrayList<>(setOfChar);

        for (int i = 0; i < listOfChar.size(); i++) {
            int count = 0;
            for (String s : arr) {
                if (s.contains(listOfChar.get(i))) {
                    count++;
                }
            }

            if (count == arr.size()) {
                strResult = strResult + listOfChar.get(i);
            }
        }

        result = strResult.length();
        return result;
    }
}
