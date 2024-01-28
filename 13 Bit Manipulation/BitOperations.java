import java.util.Scanner;

public class BitOperations {

    public static void getIthBit(int num, int i) {

        if ((num & (1 << i)) != 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static int setIthBit(int num, int i) {
        int bitMask = 1 << i;
        return num | bitMask;
    }

    public static int clearIthBit(int num, int i) {
        int bitMask = ~(1 << i);
        return num & bitMask;
    }

    public static int updateIthBit(int num, int i, int newBit) {
        // first Approach
        // if (newBit == 0) {
        // return setIthBit(num, i);
        // } else {
        // return clearIthBit(num, i);
        // }

        num = clearIthBit(num, i);
        int bitMask = newBit << i;
        return num | bitMask;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the num vlaue: ");
        int num = scan.nextInt();
        System.out.print("Enter the ith vlaue: ");
        int i = scan.nextInt();

        // get ith bit
        // getIthBit(num, i);

        // set ith bit with 1;
        // System.out.println(setIthBit(num, i));

        // clear ith bit
        // System.out.println(clearIthBit(num, i));

        // update ith bit
        System.out.println(updateIthBit(10, 2, 1));

        scan.close();
    }
}
