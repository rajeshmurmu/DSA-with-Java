
public class AToPowerB {

    public static int aToPowerB(int a, int b) {

        if (b == 0) {
            return 1;
        }

        int halfPower = aToPowerB(a, b / 2);

        if (b % 2 != 0) {
            return a * halfPower * halfPower;
        }

        return halfPower * halfPower;

    }

    public static void main(String[] args) {
        int n = 2;
        int pow = 0;

        System.out.println(aToPowerB(n, pow));
        ;
    }
}
