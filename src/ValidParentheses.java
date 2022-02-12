public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()rx([dZq(q))Oi(((L))KM";

        System.out.println(validParentheses(s));

    }

    public static boolean validParentheses(String parens) {
        //Put code below
        boolean response = true;
        int countOpenParenthesis = 0;

        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(') {
                countOpenParenthesis++;
            } else if (parens.charAt(i) == ')') {
                countOpenParenthesis--;
            }
            if (countOpenParenthesis == -1) {
                response = false;
                break;
            }
        }

        if (countOpenParenthesis > 0) {
            response = false;
        }

        return response;
    }
}
