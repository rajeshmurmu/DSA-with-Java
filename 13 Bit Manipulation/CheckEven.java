import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int bitMask = num & 1;
        if (bitMask == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }

        scan.close();
    }

}
