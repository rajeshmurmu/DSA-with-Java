import java.util.Scanner;

public class productOfTwoNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int product = num1*num2;
        System.out.println(product);

        sc.close();
    }
}
