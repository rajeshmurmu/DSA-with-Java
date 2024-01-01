import java.util.Scanner;

public class passOrFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        float marks = input.nextFloat();

        String result = marks>35?"Pass":"Fail";
        System.out.println(result);

        input.close();
    }
}
