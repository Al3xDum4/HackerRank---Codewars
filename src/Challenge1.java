import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge1 {
    public static String autocorrect(String input) {

        String result = "";
        String pattern = "(\\byo)((u*\\b)|(u\\b))|(\\bu\\b)";

        result = input.replaceAll(pattern,"your client");

        return result;

    }

    public static void main(String[] args) {
        System.out.println(autocorrect("I stand with youuu. Please tell me if u know something. Youtube is best. You and your friends."));
    }
}
