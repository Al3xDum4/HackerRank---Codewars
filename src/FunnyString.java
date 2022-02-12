import java.util.Arrays;

public class FunnyString {
    public static void main(String[] args) {
        String s = "bcxz";

        System.out.println(funnyString(s));

    }

    public static String funnyString(String s) {
        String result = "";
        String reverseS = "";
        int[] sAscii = new int[s.length()];
        int[] absAsciiDif = new int[s.length()-1];

        StringBuffer sbr = new StringBuffer(s);
        sbr.reverse();
        reverseS = String.valueOf(sbr);

        int[] reverseSAscii = new int[reverseS.length()];
        int[] absReverseAsciiDif = new int[reverseS.length()-1];

        for (int i = 0; i < s.length(); i++) {
            sAscii[i] = s.charAt(i);
        }

        for (int i = 0; i < reverseS.length(); i++) {
            reverseSAscii[i] = reverseS.charAt(i);
        }

        for (int i = 0; i < sAscii.length-1; i++) {
           absAsciiDif[i] = Math.abs(sAscii[i] - sAscii[i+1]);
        }

        for (int i = 0; i < reverseSAscii.length-1; i++) {
            absReverseAsciiDif[i] = Math.abs(reverseSAscii[i] - reverseSAscii[i+1]);
        }

        if(Arrays.equals(absAsciiDif, absReverseAsciiDif)){
            result = "Funny";
        } else {
            result = "Not Funny";
        }

        return result;
    }
}
