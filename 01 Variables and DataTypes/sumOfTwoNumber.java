import java.util.Scanner;

public class sumOfTwoNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the value of num1 : ");
        int num1 = sc.nextInt();
        System.err.println("Enter the value of num1 : ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println(sum);

        sc.close();
        
    }
}
