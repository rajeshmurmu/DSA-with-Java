import java.util.Scanner;

public class average {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int num1 = read.nextInt();
        int num2 = read.nextInt();
        int num3 = read.nextInt();

        int average =(num1+num2+num3)/3;
        System.out.println(average);
        

        read.close();
    }
}
