public class triangle01 {
    public static void main(String[] args) {
        int n=6;
        int b=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                b=0;
            }
            else
            {
                b=1;
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(b+" ");
                if(b==1)
                {
                    b=0;
                }
                else
                {
                    b=1;
                }
            }
            System.out.println();
        }
    }
}
