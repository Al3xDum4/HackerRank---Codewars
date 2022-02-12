public class SumOfNumbers {
    public static void main(String[] args) {
        int a = 0;
        int b = -1;

        System.out.println(GetSum(a,b));
    }

    public static int GetSum(int a, int b)
    {
        //Good luck!
        int max = Math.max(a, b);
        int sum = (max/2)*(a+b);

        return sum;
    }
}
