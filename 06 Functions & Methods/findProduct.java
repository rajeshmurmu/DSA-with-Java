import java.util.Scanner;

public class findProduct {

    public static int multiply(int a, int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int result = multiply(num1, num2);
        System.out.println(result);

        scan.close();
    }
}
