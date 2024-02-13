// Sum of first N natural numbers;

import java.util.Scanner;

public class sumOfNnumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int N = read.nextInt();
        int sum=0;
        int i=1;
        while(i<=N)
        {
            sum+=i;
            i++;
        }
        System.out.println("The Sum is : "+sum);
        read.close();

    }
}
