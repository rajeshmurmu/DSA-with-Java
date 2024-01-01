import java.util.Scanner;

public class largestOf3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of num1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter the value of num2 : ");
        int num2 = input.nextInt();

        System.out.print("Enter the value of num3 : ");
        int num3 = input.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println(num1 + " is greater");
        }
        else if(num2 > num3){
            System.out.println(num2 + " is greater");
        }
        else {
            System.out.println(num3 + " is greater");
        }

        input.close();
    }
}
