public class ConsecutiveStrings {
    public static void main(String[] args) {
        String[] strarr = {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};

        System.out.println(longestConsec(strarr, 2));
    }

    public static String longestConsec(String[] strarr, int k) {
        // your code
        String rightAnswer = "";
        String intermed = "";

        for (int i = 0; i < strarr.length; i++) {
            String s = "";
            for (int j = 0; j < k; j++) {
                if (i + j >= strarr.length) {
                    break;
                }
                s = s + strarr[i + j];
            }
            intermed = s;
            if (rightAnswer.length() < intermed.length()) {
                rightAnswer = intermed;
            }
        }

        return rightAnswer;
    }
}
