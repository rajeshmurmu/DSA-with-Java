import java.util.Scanner;

public class vowelOrNot{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char c = input.next().charAt(0);
        
        if(c=='a' || c == 'e' || c=='o' || c=='i' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }

        input.close();
    }
}