import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = scan.nextInt();
        solidRhombus(num);

        scan.close();
    }

    public static void solidRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            // for(int space=n-1;space>=i;space--)
            for(int space=1;space<=n-i;space++)
            {
                System.out.print("  ");
            }
            for(int star=1;star<=n;star++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
