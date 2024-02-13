
public class SumOfNNum {

    public static int sumOfNNnumbers(int n) {
        if (n == 1) {
            return n;
        }

        return n + sumOfNNnumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfNNnumbers(n));
    }
}
