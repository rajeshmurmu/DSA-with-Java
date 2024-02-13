
public class MazePath {

    public static int mazePath(int n, int m, int sr, int ec) {

        int ans = 0;
        if (sr == n - 1 && ec == m - 1) {
            return 1;
        }

        else if (ec == m - 1) {
            ans += mazePath(n, m, sr + 1, ec);

        } else if (sr == n - 1) {
            ans += mazePath(n, m, sr, ec + 1);

        } else {
            ans += mazePath(n, m, sr, ec + 1);
            ans += mazePath(n, m, sr + 1, ec);
        }

        return ans;

    }

    public static void main(String[] args) {
        int n = 4, m = 4;

        int ways = mazePath(n, m, 0, 0);
        System.out.println(ways);
    }
}
