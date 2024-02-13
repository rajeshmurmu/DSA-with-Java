import java.util.Scanner;

public class InvertedHPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = scan.nextInt();

        invertedHPyramid(num);

        scan.close();
    }
    public static void invertedHPyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
