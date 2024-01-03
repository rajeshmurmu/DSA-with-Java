// Continue Statement

import java.util.Scanner;

public class continueStatement {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        for(int i=1;i<=5;i++){
            if(i==3) continue;
            System.out.println(i);
        }

        read.close();
    }
}
