public class HelpTheBookseller {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        // your code here
        String result = "";
        for(int i = 0; i < lstOf1stLetter.length; i++){
            int count = 0;
            for(int j = 0; j < lstOfArt.length; j++){
                String s = lstOfArt[j];
                if(lstOf1stLetter[i].charAt(0) == s.charAt(0)){
                    String[] str = lstOfArt[j].split(" ");
                    count = count + Integer.parseInt(str[1]);
                }
            }
            result = result + "(" + lstOf1stLetter[i] + " : " + count + ")" + " - ";
        }
        StringBuffer sb = new StringBuffer(result);
        sb.deleteCharAt(sb.length()-2);
        result = sb.toString();

        return result;
    }

    public static void main(String[] args) {

        String[] lstOfArt = {"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] lstOf1stLetter = {"A", "B"};

        System.out.println(stockSummary(lstOfArt, lstOf1stLetter));

    }
}
