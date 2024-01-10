import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = scan.nextInt();

        if(isEven(num))
        {
            System.out.println(num + " is Even.");
        }
        else
        {
            System.out.println(num + " is Odd.");
        }
        scan.close();
    }
    public static boolean isEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
