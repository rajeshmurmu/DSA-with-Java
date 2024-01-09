import java.util.Scanner;

public class PrimeInRange {

    // To check Prime
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }

        return true;
    }


    // To print Prime from 2 to given range
    public static void primesInRange(int r)
    {
        for(int i=2;i<=r;i++)
        {
            if(isPrime(i))
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int N = scan.nextInt();
        primesInRange(N);
        scan.close();
    }
}
