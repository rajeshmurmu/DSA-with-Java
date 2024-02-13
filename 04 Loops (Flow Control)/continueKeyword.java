import java.util.Scanner;

public class continueKeyword {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i =1;
        do{
            System.out.println("Enter Your Number : ");
            int n = read.nextInt();
            if(n%10==0)continue;
            System.out.println(n);
        }while(i<1000);

        read.close();
    }
}
