public class SumOfDigits {
    public static void main(String[] args) {
        int n = 674;
        System.out.println(digital_root(n));
    }

    public static int digital_root(int n) {
        int a;
        int result = 0;

        while (n > 0) {
            a = n % 10;
            result = result + a;
            n = n / 10;
        }

        return result;
    }
}
