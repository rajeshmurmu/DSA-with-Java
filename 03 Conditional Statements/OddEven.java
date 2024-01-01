import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = input.nextInt();

        if(num %2 == 0){
            System.out.println(num + " is Even Number");
        }
        else 
        {
            System.out.println(num + " is Odd Number");
        }

        input.close();
    }
}
