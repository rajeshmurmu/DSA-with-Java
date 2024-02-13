// Print sum of cube of first n natural number;

import java.util.Scanner;

public class SumOfCubeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int N = scan.nextInt();
        int sum = 0;
        for(int i=1;i<=N;i++)
        {
            sum+=cube(i);
        }

        System.out.println(sum);
        scan.close();
    }

    public static int cube(int n)
    {
        int cube=1;
        for(int i=1;i<=3;i++)
        cube *=n;

        return cube;
    }
}
