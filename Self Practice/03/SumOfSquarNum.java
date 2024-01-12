import java.util.Scanner;
// Print Sum of square of first n natural number.
public class SumOfSquarNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int N = scan.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++)
        {
            sum+=square(i);
        }
        System.out.println(sum);
        scan.close();
    }

    public static int square(int n)
    {
        int pow=1;
        for(int i=1;i<=2;i++)
        {
            pow *=n;
        }
        return pow;
    }
}
