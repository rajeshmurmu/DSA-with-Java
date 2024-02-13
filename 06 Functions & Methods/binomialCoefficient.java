import java.util.Scanner;

public class binomialCoefficient {

    // factorial
    public static int factorial(int n)
    {
        if(n==0) return 1;

        return n*factorial(n-1);
    }

    // binomialCoefficient
    public static int biCoefficient(int n, int r)
    {
        return factorial(n)/(factorial(r)*factorial(n-r));
    }

    public static void main(String[] args) {
        // formulae = n!/r!(n-r)!
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int N = scan.nextInt();
        System.out.print("Enter the value of R : ");
        int R = scan.nextInt();

        // Binomial Coefficient
        int result = biCoefficient(N, R);
        System.out.println(result);

        scan.close(); 
    }
}
