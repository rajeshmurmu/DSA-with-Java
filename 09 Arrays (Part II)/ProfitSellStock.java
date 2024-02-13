public class ProfitSellStock {

    public static void ProfitPrice(int arr[]) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        // arr[i]==sellPrice;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > buyPrice) {
                profit = Math.max(arr[i] - buyPrice, profit);
            } else {
                buyPrice = arr[i];
            }
        }

        System.out.println(profit);

    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        ProfitPrice(prices);
    }
}
