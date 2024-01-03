// Print number from 1 to N;

import java.util.Scanner;

public class printOneToN {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n=read.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }

        read.close();
    }
}
