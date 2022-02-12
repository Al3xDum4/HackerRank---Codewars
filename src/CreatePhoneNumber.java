import java.util.Arrays;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(createPhoneNumber(a));

    }

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        String s = "(";
        for (int i = 0; i < numbers.length; i++) {
           s = s + numbers[i];
           if(s.length() == 4) {
               s = s+") ";
           } else if (s.length() == 9){
               s = s+"-";
           }
        }
        return s;
    }
}
