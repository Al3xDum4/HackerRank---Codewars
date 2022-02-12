public class Mumbling {
    public static void main(String[] args) {
        String s = ("ZpglnRxqenU");

        System.out.println(accum(s));

    }

    public static String accum(String s) {
        // your code
        String preResult = "";
        for (int i = 0; i < s.length(); i++) {
            int a = i;
            while (a >= 0) {
                preResult = preResult + s.toLowerCase().charAt(i);
                a--;
            }
            if (i < s.length() - 1) {
                preResult = preResult + "-";
            }
        }

        String words[] = preResult.split("-");
        String result = "";

        for (int j = 0; j < words.length; j++) {
            String concatLetters = "";
            String first = words[j].substring(0, 1);
            String rest = words[j].substring(1);
            concatLetters = first.toUpperCase() + rest;
            if (j < words.length - 1) {
                result = result + concatLetters + "-";
            } else {
                result = result + concatLetters;
            }
        }
        return result;
    }
}
