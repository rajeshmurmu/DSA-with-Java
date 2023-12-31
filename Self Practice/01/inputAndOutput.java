// Link:- https://www.codingninjas.com/studio/problems/find-character-case_58513?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.Scanner;
public class inputAndOutput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        int c = a;

        if(c>=65 && c<=90)
        {
            System.out.print(1);
        }
        else if(c>=97 && c<=122)
        {
            System.out.print(0);
        }
        else{
            System.out.print(-1);
        }
        sc.close();
    }
}