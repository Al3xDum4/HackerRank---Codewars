import java.util.ArrayList;
import java.util.List;

public class DecodeTheMorseCode {
    public static void main(String[] args) {
        String string = "0011001100";

        System.out.println(decodeBits(string));

        System.out.println(decodeMorse(decodeBits(string)));
    }

    public static String decodeBits(String bits) {

        String result = "";
        List<String> divideBitsString = new ArrayList<>();
        //int rate = 0;
        boolean rateIsTwo = false;
        boolean rateIsTree = false;
        boolean rateIsOne = false;
        String bitsOne = "";
        String bitsZero = "";

        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '1') {
                bitsOne = bitsOne + bits.charAt(i);
                if (bitsZero != "") {
                    divideBitsString.add(bitsZero);
                }
                bitsZero = "";
            } else if (bits.charAt(i) == '0') {
                bitsZero = bitsZero + bits.charAt(i);
                if (bitsOne != "") {
                    divideBitsString.add(bitsOne);
                }
                bitsOne = "";
            }
        }

        if (bitsOne != "") {
            divideBitsString.add(bitsOne);
        } else if (bitsZero != "") {
            divideBitsString.add(bitsZero);
        }


        if (divideBitsString.get(0).contains("0")) {
            divideBitsString.remove(divideBitsString.get(0));
        }

        if (divideBitsString.get(divideBitsString.size() - 1).contains("0")) {
            divideBitsString.remove(divideBitsString.get(divideBitsString.size() - 1));
        }

        for (int i = 0; i < divideBitsString.size(); i++) {
            if (divideBitsString.get(i).length() % 2 == 0) {
                rateIsTwo = true;
            } else if (divideBitsString.get(i).length() % 3 == 0) {
                rateIsTree = true;
            } else {
                rateIsOne = true;
            }
        }

        if (divideBitsString.size() >= 3) {
            if (rateIsOne) {
                for (int i = 0; i < divideBitsString.size(); i++) {
                    if (divideBitsString.get(i).length() == 1 && divideBitsString.get(i).contains("1")) {
                        result += ".";
                    } else if (divideBitsString.get(i).length() == 3 && divideBitsString.get(i).contains("1")) {
                        result += "-";
                    } else if (divideBitsString.get(i).length() == 3 && divideBitsString.get(i).contains("0")) {
                        result += " ";
                    } else if (divideBitsString.get(i).length() == 7 && divideBitsString.get(i).contains("0")) {
                        result += "  ";
                    }
                }
            }

            if (rateIsTwo) {
                for (int i = 0; i < divideBitsString.size(); i++) {
                    if (divideBitsString.get(i).length() == 2 && divideBitsString.get(i).contains("1")) {
                        result = result + ".";
                    } else if (divideBitsString.get(i).length() == 6 && divideBitsString.get(i).contains("1")) {
                        result = result + "-";
                    } else if (divideBitsString.get(i).length() == 6 && divideBitsString.get(i).contains("0")) {
                        result = result + " ";
                    } else if (divideBitsString.get(i).length() == 14 && divideBitsString.get(i).contains("0")) {
                        result = result + "  ";
                    }
                }
            }

            if (rateIsTree) {
                for (int i = 0; i < divideBitsString.size(); i++) {
                    if (divideBitsString.get(i).length() == 3 && divideBitsString.get(i).contains("1")) {
                        result = result + ".";
                    } else if (divideBitsString.get(i).length() == 9 && divideBitsString.get(i).contains("1")) {
                        result = result + "-";
                    } else if (divideBitsString.get(i).length() == 9 && divideBitsString.get(i).contains("0")) {
                        result = result + " ";
                    } else if (divideBitsString.get(i).length() == 21 && divideBitsString.get(i).contains("0")) {
                        result = result + "  ";
                    }
                }
            }
        } else {
            result += ".";
        }

        return result;
    }

    public static String decodeMorse(String morseCode) {
        String decodeResult = "";
        String[] splitByWord = morseCode.split("\\s{2}");

        for (int i = 0; i < splitByWord.length; i++) {
            String[] splitByLetter = splitByWord[i].split("\\s");
            for (int j = 0; j < splitByLetter.length; j++) {
                if (splitByLetter[j].equalsIgnoreCase(".-"))
                    decodeResult += "a";
                if (splitByLetter[j].equalsIgnoreCase("-..."))
                    decodeResult += "b";
                if (splitByLetter[j].equalsIgnoreCase("-.-."))
                    decodeResult += "c";
                if (splitByLetter[j].equalsIgnoreCase("-.."))
                    decodeResult += "d";
                if (splitByLetter[j].equalsIgnoreCase("."))
                    decodeResult += "e";
                if (splitByLetter[j].equalsIgnoreCase("..-."))
                    decodeResult += "f";
                if (splitByLetter[j].equalsIgnoreCase("--."))
                    decodeResult += "g";
                if (splitByLetter[j].equalsIgnoreCase("...."))
                    decodeResult += "h";
                if (splitByLetter[j].equalsIgnoreCase(".."))
                    decodeResult += "i";
                if (splitByLetter[j].equalsIgnoreCase(".---"))
                    decodeResult += "j";
                if (splitByLetter[j].equalsIgnoreCase("-.-"))
                    decodeResult += "k";
                if (splitByLetter[j].equalsIgnoreCase(".-.."))
                    decodeResult += "l";
                if (splitByLetter[j].equalsIgnoreCase("--"))
                    decodeResult += "m";
                if (splitByLetter[j].equalsIgnoreCase("-."))
                    decodeResult += "n";
                if (splitByLetter[j].equalsIgnoreCase("---"))
                    decodeResult += "o";
                if (splitByLetter[j].equalsIgnoreCase(".--."))
                    decodeResult += "p";
                if (splitByLetter[j].equalsIgnoreCase("--.-"))
                    decodeResult += "q";
                if (splitByLetter[j].equalsIgnoreCase(".-."))
                    decodeResult += "r";
                if (splitByLetter[j].equalsIgnoreCase("..."))
                    decodeResult += "s";
                if (splitByLetter[j].equalsIgnoreCase("-"))
                    decodeResult += "t";
                if (splitByLetter[j].equalsIgnoreCase("..-"))
                    decodeResult += "u";
                if (splitByLetter[j].equalsIgnoreCase("...-"))
                    decodeResult += "v";
                if (splitByLetter[j].equalsIgnoreCase(".--"))
                    decodeResult += "w";
                if (splitByLetter[j].equalsIgnoreCase("-..-"))
                    decodeResult += "x";
                if (splitByLetter[j].equalsIgnoreCase("-.--"))
                    decodeResult += "y";
                if (splitByLetter[j].equalsIgnoreCase("--.."))
                    decodeResult += "z";
                if (splitByLetter[j].equalsIgnoreCase("-----"))
                    decodeResult += "0";
                if (splitByLetter[j].equalsIgnoreCase(".----"))
                    decodeResult += "1";
                if (splitByLetter[j].equalsIgnoreCase("..---"))
                    decodeResult += "2";
                if (splitByLetter[j].equalsIgnoreCase("...--"))
                    decodeResult += "3";
                if (splitByLetter[j].equalsIgnoreCase("....-"))
                    decodeResult += "4";
                if (splitByLetter[j].equalsIgnoreCase("....."))
                    decodeResult += "5";
                if (splitByLetter[j].equalsIgnoreCase("-...."))
                    decodeResult += "6";
                if (splitByLetter[j].equalsIgnoreCase("--..."))
                    decodeResult += "7";
                if (splitByLetter[j].equalsIgnoreCase("---.."))
                    decodeResult += "8";
                if (splitByLetter[j].equalsIgnoreCase("----."))
                    decodeResult += "9";
                if (splitByLetter[j].equalsIgnoreCase("|"))
                    decodeResult += "";

            }
            if (i < splitByWord.length - 1) {
                decodeResult += " ";
            }
        }
        return decodeResult.toUpperCase();
    }
}
