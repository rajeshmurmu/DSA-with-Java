import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = scan.nextInt();

        floydTriangle(num);

        scan.close();
    }

    public static void floydTriangle(int n)
    {
        int count = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
