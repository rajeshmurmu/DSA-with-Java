
public class Fibonacci {

    // using for loop
    // public static int fibonacci(int n) {
    // int prev = 0;
    // int current = 1;
    // int sum = 0;

    // for (int i = 0; i < n; i++) {
    // sum = prev + current;
    // prev = current;
    // current = sum;
    // }
    // return sum;
    // }

    // Using Recursion
    public static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 2;

        System.out.println(fibonacci(n));
    }

}
