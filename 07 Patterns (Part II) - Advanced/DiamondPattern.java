import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = scan.nextInt();

        diamondPattern(num);
        scan.close();
    }

    public static void diamondPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=n-i;space++)
            {
                System.out.print("  ");
            }
            for(int star=1;star<=i*2-1;star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        
        for(int i=n;i>=1;i--)
        {
            for(int space=1;space<=n-i;space++)
            {
                System.out.print("  ");
            }
            for(int star=1;star<=i*2-1;star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
