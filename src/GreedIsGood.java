public class GreedIsGood {
    public static void main(String[] args) {
        int dice[] = {5,5,5,1,5};

        System.out.println(greedy(dice));

    }

    public static int greedy(int[] dice) {
        //code here
        int result = 0;
        int count1 = 0;
        int count5 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count6 = 0;

        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                count1++;
            } else if (dice[i] == 2) {
                count2++;
            } else if (dice[i] == 3) {
                count3++;
            } else if (dice[i] == 4) {
                count4++;
            } else if (dice[i] == 5) {
                count5++;
            } else {
                count6++;
            }
        }

        if (count1 > 3) {
            result = result + 1000 + ((count1 - 3) * 100);
        } else if (count1 == 3) {
            result = result + 1000;
        } else {
            result = result + (count1 * 100);
        }

        if (count2 >= 3) {
            result = result + 200;
        }

        if (count3 >= 3) {
            result = result + 300;
        }

        if (count4 >= 3) {
            result = result + 400;
        }

        if (count5 > 3) {
            result = result + 500 + ((count5 - 3) * 50);
        } else if (count5 == 3) {
            result = result + 500;
        } else {
            result = result + (count5 * 50);
        }

        if (count6 >= 3) {
            result = result + 600;
        }

        return result;
    }
}
