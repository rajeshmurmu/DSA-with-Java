import java.util.Scanner;

public class DecimalToBinary {

    // Decimal to binary Number;
    public static int DecimalToBinaryNumber(int n)
    {
        int binary = 0;
        int count = 0;

        while(n!=0)
        {
            int rem = n%2;
            binary +=Math.pow(10, count)*rem;
            count++;
            n/=2;

        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any Decimal Number : ");
        int N = scan.nextInt();
        System.out.println(DecimalToBinaryNumber(N));
        scan.close();
    }
}
