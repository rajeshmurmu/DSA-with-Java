import java.util.Scanner;

public class HollowRectangle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = scan.nextInt();
        hollowRectangle(num);
        scan.close();

    }
    public static void hollowRectangle(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=5;col++)
            {
                if(row==1 || row==n || col==1 || col==5)
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