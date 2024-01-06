public class butterFly {


    // try it for different type
    // public static void halfButterFly(int x)
    // {
    //     for(int i=1;i<=x;i++)
    //     {
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.out.print("* ");
    //         }
            

    //         // for(int j=x;j>=i;j--)
    //         // {
    //         //     System.out.print("* ");
    //         // }
    //         System.out.println();
    //     }


    //     for(int i=1;i<=x;i++)
    //     {

    //         for(int j=x;j>=i;j--)
    //         {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void halfUpButterFly(int n)
    {
        for(int i=1;i<=n;i++)
        {

            // left side
            for(int j=1;j<=i;j++)
            {
                
                System.out.print("* ");
                
            }

            for(int j=i+1;j<=n;j++)
            {
                System.out.print("  ");
            }


            //right side
            for(int j=n-1;j>=i;j--)
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

    public static void halfDownButterFly(int n)
    {
        for(int i=1;i<=n;i++)
        {
            // for downLeft
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("* ");
            }

            for(int j=1;j<=i-1;j++)
            {
                System.out.print("  ");
            }



            // for downRight
            // for(int j=1;j<=n-i;j++)
            // {
            //     System.out.print("  ");
            // }

            // for(int j=1;j<=i;j++)
            // {
            //     System.out.print("* ");
            // }

            for(int j=1;j<=i-1;j++)
            {
                System.out.print("  ");
            }

            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=20;

        halfUpButterFly(n);
        halfDownButterFly(n);
    }
}

