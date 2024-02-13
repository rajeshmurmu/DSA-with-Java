import java.util.Scanner;

public class tickectDiscount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int age = scan.nextInt();

        if(age<=12 || age>=65)
        {
            System.out.println("You are Eligible for Discount");
        }
        else
        {
            System.out.println("You are Not Eligible for Discount");
        }
        scan.close();

    }
}
