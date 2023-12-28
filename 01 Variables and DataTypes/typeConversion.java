import java.util.Scanner;

public class typeConversion {
    public static void main(String[] args){
        
        // below code is allow
        // int a =25;
        // long b = a;
        // System.out.println(b);


        // below code is not allow
        // long a = 25;
        // int b = a;
        // System.out.println();

        // example 3

        Scanner sc = new Scanner(System.in);

        float num = sc.nextInt();
        System.out.println(num);

        sc.close();
    }
}
