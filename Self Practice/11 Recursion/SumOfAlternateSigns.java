public class SumOfAlternateSigns {

    static int ans = 0;

    public static void sumOfAlternateSigns(int n) {
        if (n == 0) {
            return;
        }
        sumOfAlternateSigns(n - 1);
        if (n % 2 == 0) {
            ans = ans - n;
        } else {
            ans = ans + n;
        }
    }

    public static int sumOfAlternateSigns2(int n) {
        if (n == 0) {
            return 0;
        }

        if (n % 2 == 0) {
            return sumOfAlternateSigns2(n - 1) - n;
        } else {
            return sumOfAlternateSigns2(n - 1) + n;
        }

    }

    public static void main(String[] args) {
        int n = 5;
        // sumOfAlternateSigns(n);
        // System.out.println(ans);

        System.out.println(sumOfAlternateSigns2(n));

    }
}
