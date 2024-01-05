import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // print 20 times a string;
        for(int i=1;i<=20;i++)
        {
            System.out.println("India will win the World Cup 2023");
        }


        // Print all Odd numbers from 1 to n;
        System.out.print("Enter the value of N : ");
        int n = scan.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }


        // Print all numbers from 1 to n divisible by 4;

        for(int i=0;i<n;i++)
        {
            if(i%4==0)
            {
                System.out.println(i);
            }
        }


        scan.close();
    }
}
