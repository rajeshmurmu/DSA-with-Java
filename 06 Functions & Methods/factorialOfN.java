import java.util.Scanner;

public class factorialOfN {

    public static int factorial(int n)
    {
        // factorial using loop;
        // int fact = 1;
        // for(int i=1;i<=n;i++)
        // {
        //     fact = fact*i;
        // }
        // System.out.println(fact);


        // factorial using recursion;
        if(n==0) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int N = scan.nextInt();

        System.out.println(factorial(N));



        scan.close();
    }
}
