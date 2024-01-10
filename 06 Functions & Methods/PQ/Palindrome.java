import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = scan.nextInt();

        isPalindrome(num);
        scan.close();
    }

    public static void isPalindrome(int n)
    {
        int n2 = n;
        int rev_num = 0;
        while(n!=0)
        {
            int rem = n%10;
            rev_num =(rev_num*10)+rem;
            n/=10;
        }

        if(rev_num==n2)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        // System.out.println(rev_num);
    }
}
