public class Small {
    public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        int large = 0;
        int small = 0;

        if(items > availableLargePackages) {
            large = availableLargePackages;
            if(((((items/5) - large) * 5) + items%5) < availableSmallPackages ) {
                small = ((items/5) - large) * 5 + items%5;
            }
        } else if (items < availableLargePackages && items < availableSmallPackages) {
            small = items;
        } else if (items == availableLargePackages){
            large = 1;
        } else {
            return -1;
        }
        return large+small;
    }


    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(2,3,0));
    }
}
