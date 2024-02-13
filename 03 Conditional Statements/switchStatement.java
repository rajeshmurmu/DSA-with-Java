import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an input : ");
        int num = input.nextInt();

        // Switch Statement;
        switch(num){
            case 1: System.out.println("Samosa");
            break;
            case 2: System.out.println("Burger");
            break;
            case 3: System.out.println("Mango Shake");
            break;
            default : System.out.println("Enter a valid input");
        }
        input.close();
    }
}
