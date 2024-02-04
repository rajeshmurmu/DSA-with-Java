public class BinaryStrings {

    public static void printBinaryStrings(int n, int lastPlace, String str) {
        // if (lastPlace == 0) {
        // printBinaryStrings(n - 1, 0, str.append("0"));
        // printBinaryStrings(n - 1, 1, str.append("1"));
        // } else {
        // printBinaryStrings(n - 1, 0, str.append("0"));
        // }

        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinaryStrings(n - 1, 0, str + "0");

        if (lastPlace == 0) {
            printBinaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBinaryStrings(3, 0, "");
    }
}
