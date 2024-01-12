import java.util.Scanner;
// Print n'th Fibonacci number
public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = scan.nextInt();

        Fibonacci(num);
        scan.close();
    }
    public static void Fibonacci(int n)
    {
        int current=0,prev=1,first=0;
        for(int i=first;i<n;i++)
        {
            current=prev+first;
            first=prev;
            prev=current;
        }
        System.out.println(current);
    }
}