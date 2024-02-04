
public class TilingProblem {

    public static int getTilingWays(int n) { // 2xn (floor Size)
        if (n == 0 || n == 1) {
            return 1;
        }

        int totalWays = getTilingWays(n - 1) + getTilingWays(n - 2);
        return totalWays;
    }

    public static void main(String args[]) {
        int n = 2;
        System.out.println(getTilingWays(n));
    }
}