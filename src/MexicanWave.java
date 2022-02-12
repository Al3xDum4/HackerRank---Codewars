import java.util.*;

public class MexicanWave {
    public static void main(String[] args) {
        String string = "two words";

        System.out.println(Arrays.asList(wave(string)));

    }

    public static String[] wave(String str) {
        // Your code here
        //String[] waveWords = new String[str.length()];
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                String s1 = str.substring(0, i);
                String s11 = str.substring(i, i + 1);
                String s111 = str.substring(i + 1);
                String word = s1 + s11.toUpperCase() + s111;
                list.add(word);
            } else {
                continue;
            }
        }
        String[] waveWords = list.stream().toArray(String[]::new);
        return waveWords;
    }
}
