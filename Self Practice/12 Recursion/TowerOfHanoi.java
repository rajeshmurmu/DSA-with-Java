
public class TowerOfHanoi {

    public static void tower(int n, char s, char h, char d) {

        if (n == 0) {
            return;
        }

        tower(n - 1, s, d, h);
        System.out.println(s + " --> " + d);
        tower(n - 1, h, s, d);
    }

    public static void main(String[] args) {
        int n = 4;

        tower(n, 'A', 'B', 'C');
    }
}
