import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = scan.nextInt();
        binaryTriangle(num);

        scan.close();
    }
    public static void binaryTriangle(int n)
    {
        // int binary = 0;
        // methood I
        // for(int i=1;i<=n;i++)
        // {
        //     if(i%2==0)
        //     {
        //         binary=0;
        //     }
        //     else
        //     {
        //         binary=1;
        //     }

        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(binary+" ");
        //         if(binary==0)
        //         {
        //             binary=1;
        //         }
        //         else
        //         {
        //             binary = 0;
        //         }
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1+" ");
                }
                else
                {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }

    }
}
