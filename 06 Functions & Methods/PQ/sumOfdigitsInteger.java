import java.util.Scanner;

public class sumOfdigitsInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = scan.nextInt();
        System.out.println(AddDigits(num));

        scan.close();
    }

    public static int AddDigits(int n)
    {
        int sum =0;
        while(n!=0)
        {
            int rem = n%10;
            sum+=rem;
            n/=10;
        }

        return sum;
    }
}
