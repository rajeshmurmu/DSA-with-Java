import java.util.Scanner;

public class Assignment {

    public static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            } else if (str.charAt(i) == 'A') {
                count++;
            } else if (str.charAt(i) == 'e') {
                count++;
            } else if (str.charAt(i) == 'E') {
                count++;
            } else if (str.charAt(i) == 'i') {
                count++;
            } else if (str.charAt(i) == 'I') {
                count++;
            } else if (str.charAt(i) == 'o') {
                count++;
            } else if (str.charAt(i) == 'O') {
                count++;
            } else if (str.charAt(i) == 'u') {
                count++;
            } else if (str.charAt(i) == 'U') {
                count++;
            }
        }

        return count;
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() == str2.length()) {

            // converting string into lowerCase
            str1.toLowerCase();
            str2.toLowerCase();

            // creating duplicate string for str1 and str2;
            StringBuilder s1 = new StringBuilder("");
            StringBuilder s2 = new StringBuilder("");

            // finding charcter form char string and put it inot s1 and s2;
            String str = "abcdefghijklmnopqrstuvwxyz";
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str1.length(); j++) {
                    // check in str2;
                    if (str1.charAt(j) == str.charAt(i)) {
                        s1.append(str1.charAt(j));
                    }
                    // check in str2;
                    if (str2.charAt(j) == str.charAt(i)) {
                        s2.append(str2.charAt(j));
                    }
                }
            }

            // checking the char of s1 and s2 are same or not
            System.out.println(s1 + " " + s2);
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // String str = scan.nextLine();
        // System.out.println(countVowels(str));
        // scan.close();

        // question 4
        String str1 = "Earth";
        String str2 = "Heart";

        System.out.println(isAnagram(str1, str2));
    }
}
