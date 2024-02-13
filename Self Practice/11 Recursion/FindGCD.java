public class FindGCD {

    // recursion
    public static int findGCD(int x, int y) {
        if (y == 0) {
            return x;
        }

        return findGCD(y, x % y);
    }

    // iterative way
    public static int findGCDIterativeWay(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;

            x = y;
            y = rem;

        }
        return y;
    }

    public static void main(String[] args) {
        int x = 15;
        int y = 24;

        // System.out.println(findGCDIterativeWay(x, y));
        System.out.println(findGCD(x, y));

        int LCM = x * y / findGCD(x, y);
        System.out.println(LCM);

    }
}
