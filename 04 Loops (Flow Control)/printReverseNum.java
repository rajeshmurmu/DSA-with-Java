// Print Reverse of Number

import java.util.Scanner;

public class printReverseNum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n= read.nextInt();
        int ans = 0;

        while(n>0)
        {
            int rem = n%10;
            ans = (ans*10)+rem;
            n = n/10;

        }
        System.out.println(ans);
        read.close();
    }
}
