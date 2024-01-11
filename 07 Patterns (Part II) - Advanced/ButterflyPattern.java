import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = scan.nextInt();

        butterfly(num);


        scan.close();
    }
    public static void butterfly(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int star=1;star<=i;star++)
            {
                System.out.print("* ");
            }

            for(int space=1;space<=n*2-i*2;space++)
            {
                System.out.print("  ");
            }

            for(int star=1;star<=i;star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
            for(int star=1;star<=i;star++)
            {
                System.out.print("* ");
            }

            for(int space=1;space<=n*2-i*2;space++)
            {
                System.out.print("  ");
            }

            for(int star=1;star<=i;star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        




    }
}
