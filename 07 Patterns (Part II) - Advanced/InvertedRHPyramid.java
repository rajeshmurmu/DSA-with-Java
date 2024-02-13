import java.util.Scanner;

public class InvertedRHPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = scan.nextInt();
        InvertedRotedHalfPyramid(num);

        scan.close();
    }

    public static void InvertedRotedHalfPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
