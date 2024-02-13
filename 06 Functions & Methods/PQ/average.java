import java.util.Scanner;

public class average{


    public static int averageOfNum(int a, int b, int c)
    {
        int average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter 2nd Number : ");
        int num2 = scan.nextInt();
        System.out.print("Enter third Number : ");
        int num3 = scan.nextInt();

        int average = averageOfNum(num1,num2,num3);
        System.out.println(average);
        scan.close();
    }
}