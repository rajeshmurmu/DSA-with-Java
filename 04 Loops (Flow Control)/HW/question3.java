import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = read.nextInt();
        int ans = 1;
        for(int i=1;i<=num;i++)
        {
            ans *=i;
        }

        System.out.println(ans);

        read.close();
    }
}
