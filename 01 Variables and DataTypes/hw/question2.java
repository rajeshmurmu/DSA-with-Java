import java.util.Scanner;
// Area of a square
public class question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();

        int area = side * side;
        System.out.println("The area of a square is : "+ area);


        sc.close();
    }
}
