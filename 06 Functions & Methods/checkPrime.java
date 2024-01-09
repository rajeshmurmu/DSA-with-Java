import java.util.Scanner;

public class checkPrime {

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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = scan.nextInt();

        if(isPrime(N))
        {
            System.out.println(N + " is Prime Number.");
        }
        else
        {
            System.out.println(N + " is Not Prime Number.");
        }
        scan.close();
    }
}
