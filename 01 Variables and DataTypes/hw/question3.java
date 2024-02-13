import java.util.Scanner;
// Bill of items
public class question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float item1 = sc.nextFloat();
        float item2 = sc.nextFloat();
        float item3 = sc.nextFloat();

        double total = item1 + item2 + item3;

        System.out.println( "The total price is : "+ total);


        sc.close();
    }
}
