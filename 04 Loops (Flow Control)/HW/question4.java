import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = read.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num + " X " + i + " = " + num*i);
        }

        read.close();
    }
}
