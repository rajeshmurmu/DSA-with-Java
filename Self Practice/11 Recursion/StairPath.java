
public class StairPath {

    public static int stairPath(int n) {

        // if (n == 2 || n == 1 || n == 3) {
        if (n <= 3) {
            return n;
        }

        int totalWays = stairPath(n - 1) + stairPath(n - 2) + stairPath(n - 3);
        return totalWays;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(stairPath(n));
        ;

    }
}
