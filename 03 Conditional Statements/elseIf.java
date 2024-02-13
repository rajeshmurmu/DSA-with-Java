import java.util.Scanner;

public class elseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = input.nextInt();

        if(age >=18){
            System.out.println("Adult");
        }
        else if ( age>=13 && age <18){
            System.out.println("Teenager");
        }
        else {
            System.out.println("Child");
        }
        input.close();
    }
}
