import java.util.Scanner;

public class syntaxWithParamerters {

    public static int calculateSum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum is "+sum);
        scan.close();
    }
}
