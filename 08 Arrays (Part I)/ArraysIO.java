import java.util.Scanner;

public class ArraysIO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int marks[] = new int[100];

        marks[0]=scan.nextInt();
        marks[1]=scan.nextInt();
        marks[2]=scan.nextInt();

        // System.out.println("phy : "+marks[0]);
        // System.out.println("chem : "+marks[1]);
        // System.out.println("math : "+marks[2]);

        System.out.println(marks.length);


        scan.close();
    }
}
