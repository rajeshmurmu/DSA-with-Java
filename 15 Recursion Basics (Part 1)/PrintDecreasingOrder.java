public class PrintDecreasingOrder {

    public static void printDecreasingOrder(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasingOrder(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        printDecreasingOrder(n);
    }
}