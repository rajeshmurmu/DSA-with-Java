import java.util.*;

public class hw{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y : ");
        int y= sc.nextInt();
        System.out.print("Enter the value of z : ");
        int z= sc.nextInt();

        if(x>y && y>z){
            System.out.println("Hello");
        }

        if(z>y && z<x){
            System.out.println("Java");
        }

        if((y+200) < x && (y+150)<z){
            System.out.println("Hellow Java");
        }
    }
}