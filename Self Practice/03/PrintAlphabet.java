import java.util.Scanner;

public class PrintAlphabet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(char c='A';c<='Z';c++)
        System.out.print(c+" ");

        scan.close();
    }
}