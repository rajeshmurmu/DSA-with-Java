import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num=scan.nextInt();

        hollowRhombus(num);

        scan.close();
    }

    public static void hollowRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=n-i;space++)
            {
                System.out.print("  ");
            }

            for(int star=1;star<=n;star++)
            {
                if(i==1||i==n||star==1||star==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
