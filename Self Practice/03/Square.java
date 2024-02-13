import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = scan.nextInt();
        int pow=1;
        for(int i=1;i<=2;i++)
        {
            pow*=num;
        }
        System.out.println(pow);
        scan.close();
    }
}
