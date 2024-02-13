import java.util.Scanner;

public class BinaryToDecimal {

    public static int BinaryToDecimalNumber(int n)
    {
        int decimal=0;
        int count = 0;
        while(n!=0)
        {
            int rem = n%10;
            decimal+= Math.pow(2,count)*rem;
            count++;
            n/=10;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any Binary Number : ");
        int N = scan.nextInt();

        System.out.println(BinaryToDecimalNumber(N));
        scan.close();
    }
}
