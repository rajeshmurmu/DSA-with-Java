import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;
        int choice;

        do {
            System.out.print("Enter a Number : ");
            int num = read.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            System.out.print("Press 1 for continue and 0 for End the Game. : ");
            choice = read.nextInt();
        } while (choice == 1);

        System.out.println("The sum of Even Number Enter by you is : " + evenSum);
        System.out.println("The sum of Odd Number Enter by you is : " + oddSum);

        read.close();
    }
}
