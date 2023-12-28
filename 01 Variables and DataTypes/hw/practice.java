import java.util.Scanner;

public class practice {

     public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int side = sc.nextInt();
        // int area = side*side;
        // System.out.println(area);

        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        
        if(year%4==0 && (year%400==0 && year%100==0)) System.out.println("Leap Year");
        else System.out.println("Not a leap year");
        sc.close();
    }

}
