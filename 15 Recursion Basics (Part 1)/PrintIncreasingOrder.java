
public class PrintIncreasingOrder {

    public static void printIncreasingOrder(int n) {
        if (n == 0) {
            return;
        }

        printIncreasingOrder(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;

        printIncreasingOrder(n);
    }
}
