import java.util.Scanner;

public class breakKeyword {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        do
        {
            System.out.print("Enter Your Number : ");
            int n = read.nextInt();

            if(n%10==0) break;

            System.out.println(n);
        }while(true);

        read.close();
    }
    
}
