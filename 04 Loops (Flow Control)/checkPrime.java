// Check the number is prime or not;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = read.nextInt();
        boolean isPrime = true;

        for(int i=2;i<=Math.sqrt(num);i++)
        {
           if(num%i==0){
            isPrime = false;
           }
            
        }

        if(isPrime==true){
            System.out.println(num + " is Prime.");

        }
        else
        {
            System.out.println(num + " is Not Prime.");
        }

        read.close();
    }
}
