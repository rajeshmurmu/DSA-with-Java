
public class Palindrome {

    public static boolean isPalindrome(String str) {
        // String str2 = str;

        // This solution is by me
        // int start = 0, end = str.length() - 1;
        // while (start <= end) {
        // if (str.charAt(start) != str.charAt(end)) {
        // return false;
        // }
        // start++;
        // end--;
        // }

        // by mam
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String str = "Rajeshson";

        System.out.println(isPalindrome(str));
    }
}
