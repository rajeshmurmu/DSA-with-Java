import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Question 1
        // System.out.print("Enter a Number : ");
        // int num = input.nextInt();
        // if(num >=0)
        // {
        //     System.out.println("Positive");
        // }
        // else
        // {
        //     System.out.println("Negative");
        // }

        // Qusestion 2
        // double temp = 103.5;
        // String output = temp>100?"You have a Fever":"You don't have Fever";
        // System.out.println(output);

        // Qustion 3
        // System.out.print("Enter the index of day : ");
        // int day = input.nextInt();

        // switch(day){
        //     case 1: System.out.println("Monday");
        //     break;
        //     case 2: System.out.println("Tuesday");
        //     break;
        //     case 3: System.out.println("Wednesday");
        //     break;
        //     case 4: System.out.println("Thursday");
        //     break;
        //     case 5: System.out.println("Friday");
        //     break;
        //     case 6: System.out.println("Saturday");
        //     break;
        //     case 7: System.out.println("Sunday");
        //     break;
        //     default: System.out.println("Please Enter valid Day");
        // }

        // Qustion 4
        // int a = 63, b=36;
        // boolean x = (a<b)?true:false;
        // int y = (a>b)?a:b;
        // System.out.println("x is "+ x + " y is "+ y);

        // Question 5
        System.out.print("Enter any Year : ");
        int year = input.nextInt();

        if((year%4==0) || (year%100==0) || (year%400==0))
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }



        input.close();
    }
}
