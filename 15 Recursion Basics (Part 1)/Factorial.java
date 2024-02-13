
public class Factorial {

    public static int factorialOfN(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorialOfN(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(factorialOfN(n));
    }
}
