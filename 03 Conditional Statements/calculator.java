import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter a number2 : ");
        int num2 = input.nextInt();

        System.out.print("Enter any Operator : ");
        char operator = input.next().charAt(0);

        
        switch(operator){
            case '+': System.out.println(num1+num2);
            break;
            case '-': System.out.println(num1-num2);
            break;
            case '*': System.out.println(num1*num2);
            break;
            case '/': System.out.println(num1/num2);
            break;
            case '%': System.out.println(num1%num2);
            break;
            default : System.out.println("Enter valid operator");
        }
        input.close();
    }
}
