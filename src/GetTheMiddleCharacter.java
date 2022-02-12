public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        String vv = "testing";
        String ff = "test";

        System.out.println(getMiddle(vv));
        System.out.println(getMiddle(ff));
    }

    public static String getMiddle(String word) {
        //Code goes here!
        String re = "";
        if (word.length() % 2 == 0) {
            re = (word.charAt((word.length() / 2) - 1) + "" + (word.charAt((word.length() / 2))));
        } else {
            re = String.valueOf(word.charAt(word.length() / 2));
        }
        return re;
    }
}
