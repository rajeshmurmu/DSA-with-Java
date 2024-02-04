public class PairingFriends {

    public static int pairingFriends(int n) {
        if (n <= 2) {
            return n;
        }

        return pairingFriends(n - 1) + (n - 1) * pairingFriends(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        ;
        System.out.println(pairingFriends(n));
    }
}
