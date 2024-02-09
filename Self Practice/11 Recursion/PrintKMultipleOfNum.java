public class PrintKMultipleOfNum {

    public static void printKmultipleOfNum(int num, int k) {

        // base case
        if (k == 0) {
            return;
        }

        // recursion
        printKmultipleOfNum(num, k - 1);
        System.out.print(num * k + " ");

    }

    public static void main(String[] args) {
        int num = 15;
        int k = 5;

        printKmultipleOfNum(num, k);
    }
}
